package com.yq.controller;

import com.yq.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @Autowired
    private TestService service;

    @RequestMapping("test")
    public ModelAndView gotoIndex() {
        service.printHello();
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
