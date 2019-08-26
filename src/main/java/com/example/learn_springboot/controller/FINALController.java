package com.example.learn_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class FINALController {

	@RequestMapping(value = {"/index", "/thymeleafmerge/thymeleafExtend"}, method = RequestMethod.GET)
	public void actionMethod() {
	}
}
