package com.example.jidudu.controller;

import com.example.jidudu.dbms.User;
import com.example.jidudu.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello()
    {
        Iterable<User> user = userService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
		mv.addObject("user", user);
		
		return mv;
    }
}
