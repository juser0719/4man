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
    String hidden = "";
    int n = 1;

    @RequestMapping(value = "/final/home")
    public ModelAndView actionhome(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {

        Map<String, Object> resultMap = new HashMap<String, Object>();

        if ((paramMap.get("ID") == null || paramMap.get("ID").equals("")) && n == 1) {// 로그인 전
            resultMap.put("ID", "");
            resultMap.put("FORM1",
                    "<button type='submit' name='ID' class='text-muted p-white border-0 bg-white b'>Sign In</button>/");
            resultMap.put("FORM2",
                    "<button type='submit' class='text-muted p-white border-0 bg-white b'>Sign Up</button>");
            resultMap.put("SIGNOUT", "");
            resultMap.put("mypage", "");
        } else {// 로그인 후
            resultMap.put("ID", hidden);
            resultMap.put("FORM1", "");
            resultMap.put("FORM2", "");
            resultMap.put("SIGNOUT",
                    "<button type='submit' name='LOGOUT' class='text-muted bg-white border-0 b bg-white'>Sign Out</button>");
            resultMap.put("mypage",
                    "<button type='submit' name='mypage' class='text-muted bg-white border-0 b bg-white'>마이페이지</button>");
        }
        modelandView.addObject("resultMap", resultMap);
        return modelandView;

    }

    @RequestMapping(value = "/final/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView action01(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/final/";
        String idcheck, passcheck, serveridcheck = "", serverpasscheck = "";
        Object resultDB;
        Map<String, Object> result11 = new HashMap<String, Object>();
        Map<String, Object> resultMap = new HashMap<String, Object>();

        if ("insert".equals(action)) {// 회원가입
            service.saveObject(paramMap);
            action = "SignIn";
        } else if ("accountcheck".equals(action)) {// 로그인 db확인
            resultDB = service.getObjectid(paramMap);// DB에서 MAP으로 받아오기

            result11 = (Map<String, Object>) resultDB;

            idcheck = (String) paramMap.get("ID");// 아이디 비밀번호 변수선언
            passcheck = (String) paramMap.get("PASS");

            if (result11 != null) {//로그인 확인
                if (result11.get("ID") == null) {
                    serveridcheck = "";
                } else {
                    serveridcheck = (String) result11.get("ID");
                }

                if (result11.get("PASS") == null) {
                    serverpasscheck = "";
                } else {
                    serverpasscheck = (String) result11.get("PASS");
                }
            }

            if (serveridcheck.equals(idcheck) && serverpasscheck.equals(passcheck)) {// 계정이 맞으면
                n += 1;
                action = "home";
            } else {
                action = "SignIn";
            }

        } else if ("logout".equals(action)) {//로그아웃
            n = 1;
            action = "home";
        }

        if ((paramMap.get("ID") == null || paramMap.get("ID").equals("")) && n == 1) {// 로그인 전
            resultMap.put("ID", "");
            resultMap.put("FORM1",
                    "<button type='submit' name='ID' class='text-muted bg-white border-0 b'>Sign In</button>/");
            resultMap.put("FORM2", "<button type='submit' class='text-muted bg-white border-0 b'>Sign Up</button>");
            resultMap.put("SIGNOUT", "");
            resultMap.put("mypage", "");
        } else {// 로그인 후
            resultMap.put("FORM1", "");
            resultMap.put("FORM2", "");
            resultMap.put("SIGNOUT",
                    "<button type='submit' name='LOGOUT' class='text-muted bg-white border-0 b bg-white'>Sign Out</button>");
            resultMap.put("ID", hidden);
            resultMap.put("mypage",
                    "<button type='submit' name='mypage' class='text-muted bg-white border-0 b bg-white'>마이페이지</button>");
        }

        viewName += action;
        modelandView.setViewName(viewName);
        modelandView.addObject("paramMap", paramMap);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;
    }

}
