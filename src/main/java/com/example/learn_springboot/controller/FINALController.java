package com.example.learn_springboot.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.learn_springboot.service.FINALService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class FINALController {
    @Autowired
    private FINALService service;
    String hidden="";
    boolean A=true;
    int n = 1;
    @RequestMapping(value = "/final/home")
    public ModelAndView actionhome(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {

        Map<String, Object> resultMap = new HashMap<String, Object>();

        if(paramMap.get("ID")!=null){//로그인 아웃 구분
            n += 1;
        }else if(paramMap.get("ID")==null && n >= 2){
            n = 1;
        }

        if((paramMap.get("ID")==null || paramMap.get("ID").equals("")) && n == 1){//로그인 전
            resultMap.put("ID", "");
            resultMap.put("FORM1", "<button type='submit' name='ID' class='text-muted p-white border-0 bg-white b'>Sign In</button>/");
            resultMap.put("FORM2", "<button type='submit' class='text-muted p-white border-0 bg-white b'>Sign Up</button>");
            resultMap.put("SIGNOUT", "");
        }else if((paramMap.get("ID")!=null || !paramMap.get("ID").equals("")) && n != 1){//로그인 후
            resultMap.put("ID", hidden);
            resultMap.put("FORM1", "");
            resultMap.put("FORM2", "");
            resultMap.put("SIGNOUT", "<button type='submit' name='LOGOUT' class='text-muted bg-white border-0 b bg-white'>Sign Out</button>");
        }
        //else if(!paramMap.get("ID").equals("") && n != 1){
        //     A = false;
        //     hidden = (String)paramMap.get("ID");
        //     resultMap.put("FORM1", "");
        //     resultMap.put("FORM1", "");
        //     resultMap.put("VIEW", "<button>성공</button>");
        //     resultMap.put("ID", hidden);
        // }
            modelandView.addObject("resultMap", resultMap);
            return modelandView;

    }

    @RequestMapping(value = "/final/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView action01(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/final/";
        Object resultDB = new HashMap<String, Object>();
        Map<String, Object> resultMap = new HashMap<String, Object>();


        if((paramMap.get("ID")==null || paramMap.get("ID").equals("")) && n == 1){//로그인 전
            resultMap.put("ID", "");
            resultMap.put("FORM1", "<button type='submit' name='ID' class='text-muted bg-white border-0 b'>Sign In</button>/");
            resultMap.put("FORM2", "<button type='submit' class='text-muted bg-white border-0 b'>Sign Up</button>");
            resultMap.put("SIGNOUT", "");
        }else if((paramMap.get("ID")==null || paramMap.get("ID").equals("")) && n != 1){//로그인 후
            resultMap.put("FORM1", "");
            resultMap.put("FORM2", "");
            resultMap.put("SIGNOUT", "<button type='submit' name='LOGOUT' class='text-muted bg-white border-0 b bg-white'>Sign Out</button>");
            resultMap.put("ID", hidden);
        }else{
            resultMap.put("ID", "");
            resultMap.put("FORM1", "<button type='submit' name='ID' class='text-muted bg-white border-0 b'>Sign In</button>/");
            resultMap.put("FORM2", "<button type='submit' class='text-muted bg-white border-0 b'>Sign Up</button>");
            resultMap.put("SIGNOUT", "");
        }
        //else if(!paramMap.get("ID").equals("") && n != 1){
        //     A = false;
        //     hidden = (String)paramMap.get("ID");
        //     resultMap.put("FORM1", "");
        //     resultMap.put("FORM1", "");
        //     resultMap.put("VIEW", "<button>성공</button>");
        //     resultMap.put("ID", hidden);
        // }

        if ("edit".equals(action)) {
			resultDB = service.getObject(paramMap);
		} else if ("input".equals(action)) {
		} else if ("update".equals(action)) {
            resultDB = service.updateObject(paramMap);
            action = "home";
		} else if ("insert".equals(action)) {
			resultDB = service.saveObject(paramMap);
			action = "home";
		} else if ("read".equals(action)) {
			resultDB = service.getObject(paramMap);
		} else if ("list".equals(action)) {
			resultDB = service.getList(paramMap);
		} else if ("delete".equals(action)) {
			resultDB = service.deleteObject(paramMap);
			action = "home";
		}

        viewName += action;
        modelandView.setViewName(viewName);
        modelandView.addObject("resultDB", resultDB);
        modelandView.addObject("paramMap", paramMap);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;
    }

}