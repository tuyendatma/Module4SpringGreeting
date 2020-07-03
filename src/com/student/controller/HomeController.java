package com.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String index(@RequestParam String name, Model model){
        model.addAttribute("ten",name);
        return "index";
    }

    @GetMapping("/index")
    public ModelAndView game(@RequestParam String name){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("ten", name);
        return modelAndView;
    }
}
