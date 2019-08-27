package com.example.learn_springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FINALController {

	@RequestMapping(value = "/final/home")
	public void actionhome() {
	}

	@RequestMapping(value = "/final/{action}", method = RequestMethod.POST)
	public ModelAndView action01(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/final/";
        //Map<String, Object> resultMap = new HashMap<String, Object>();

		viewName += action;
        modelandView.setViewName(viewName);
        //modelandView.addObject("resultMap", resultMap);
        return modelandView;
    }


}