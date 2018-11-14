package com.xinqushi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {

    @RequestMapping("/")
    public ModelAndView Index(HttpServletRequest request){

        ModelAndView modelAndView = new ModelAndView();
        System.out.println(".........."+request.getRequestURI()+"---------");
        modelAndView.addObject("contextPath",request.getRequestURI());
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
