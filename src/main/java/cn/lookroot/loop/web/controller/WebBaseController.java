package cn.lookroot.loop.web.controller;

import cn.lookroot.loop.web.common.WebPageInfo;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 公共控制器
 */
public abstract class WebBaseController {
    /**
     * 设置网页的基本信息
     *
     * @param title
     * @param desc
     * @param keywords
     */
    public void setTdk(String title, String desc, String keywords) {
        //拿到request 去添加参数
        ServletRequestAttributes requestAttributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = null;
        if (requestAttributes != null) {
            request = requestAttributes.getRequest();
            WebPageInfo webPageInfo = new WebPageInfo();
            webPageInfo.setTitle(title);
            webPageInfo.setDesc(desc);
            webPageInfo.setKeywords(keywords);
            request.setAttribute("page", webPageInfo);
        }
    }
}
