package cn.lookroot.loop.web.aspect;

import cn.lookroot.loop.web.common.WebPageInfo;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 拦截controller 处理
 */
@Component
@Aspect
public class ControllerAspect {
    @Pointcut("execution(* cn.lookroot.loop.web.controller..*(..))")
    public void executeController() {

    }

    @Before("executeController()")
    public void before() {
        ServletRequestAttributes requestAttributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (requestAttributes != null) {
            HttpServletRequest request = requestAttributes.getRequest();
            WebPageInfo webPageInfo = (WebPageInfo) request.getAttribute("page");
            if (webPageInfo == null) {
                //为空 设置一个默认tdk
                webPageInfo = new WebPageInfo();
                webPageInfo.setTitle("默认标题");
                webPageInfo.setDesc("默认描述");
                webPageInfo.setKeywords("默认关键字");
                request.setAttribute("page", webPageInfo);
            }
        }
    }
}
