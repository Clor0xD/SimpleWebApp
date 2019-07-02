package com.simplewebapp.controller;

import com.simplewebapp.service.SystemPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Clor on 02.07.2019.
 * ©XCodersTeam, 2019
 */

@Controller
@RequestMapping("/")
public class SystemPropertyController {
    @Autowired
    private SystemPropertyService systemPropertyService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("systemProperty", systemPropertyService.getSystemPropertyModel());
        modelAndView.setViewName("Index");
        return modelAndView;
    }
}
