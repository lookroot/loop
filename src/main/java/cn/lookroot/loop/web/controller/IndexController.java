package cn.lookroot.loop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController extends WebBaseController {

    @GetMapping
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("/web/index");
//        setTdk("首页", "首页描述", "首页关键字");
        return mv;
    }
}
