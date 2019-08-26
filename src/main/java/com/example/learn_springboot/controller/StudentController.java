/**
 * It's Designed For incubation Center
 * @author ohsanghun
 * @version     %I%, %G%
 * @since       1.0
 */
package com.example.learn_springboot.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.learn_springboot.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ohsanghun
 * get it Mapping classlevel (JavaBean, HttpServletRequest, Model, View, ModelAndView)
 */

@Controller
public class StudentController {

	private final static String MAPPING = "/student/";

	@Autowired
	private StudentService service;

	// Receive Parameters from Html Using @RequestParam Map with @PathVariable
	@RequestMapping(value = MAPPING+"{action}", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelandView) {

		Object resultMap = new HashMap<String, Object>() ;

		// divided depending on action value
		if ("edit".equals(action)) {
			resultMap = service.getObject(paramMap);
		} else if ("input".equals(action)) {
		} else if ("update".equals(action)) {
			resultMap = service.updateObject(paramMap);
			action = "read";
		} else if ("insert".equals(action)) {
			resultMap = service.saveObject(paramMap);
			action = "read";
		} else if ("read".equals(action)) {
			resultMap = service.getObject(paramMap);
		} else if ("list".equals(action)) {
			resultMap = service.getList(paramMap);
		} else if ("delete".equals(action)) {
			resultMap = service.deleteObject(paramMap);
			action = "list";
		}

		String viewName = MAPPING + action;

		modelandView.setViewName(viewName);

		modelandView.addObject("paramMap", paramMap);
		modelandView.addObject("resultMap", resultMap);
		return modelandView;
	}
}