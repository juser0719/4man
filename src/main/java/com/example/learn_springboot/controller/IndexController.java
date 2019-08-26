package com.example.learn_springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class IndexController {

	@RequestMapping(value = {"/index", "/thymeleafmerge/thymeleafExtend"}, method = RequestMethod.GET)
	public void actionMethod(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {
		String viewName = "/index";

		// modelandView.setViewName(viewName);

		// return modelandView;
	}
}
