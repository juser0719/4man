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

    String hidden="";
    boolean A = false;
<<<<<<< HEAD

=======
>>>>>>> 399bd3263170a79ed6cc677c98523419db316754
    @RequestMapping(value = "/final/home")
    public ModelAndView actionhome(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {

        Map<String, Object> resultMap = new HashMap<String, Object>();

<<<<<<< HEAD
		if(paramMap.get("ID")== null){
			A = false;
		}else if(paramMap.get("ID")!= null){
			A = true;
		}

        if(A){
            hidden = (String) paramMap.get("ID");
		}
=======
        // if(A){
        //     hidden = (String) paramMap.get("ID");
        // }
        // A= true;
>>>>>>> 399bd3263170a79ed6cc677c98523419db316754

        // if (hidden.equals("") || hidden.equals(false)) {
        //     resultMap.put("ID", "false");
        //     resultMap.put("VIEW", "<button type='button' class='btn btn-primary'>로그인실패</button>");
        // } else {
        //     resultMap.put("ID", hidden);
        //     resultMap.put("VIEW", "<button type='button' class='btn btn-primary'>로그인성공</button>");
        // }

<<<<<<< HEAD
        modelandView.addObject("resultMap", resultMap);
        return modelandView;
=======
        if(A){
>>>>>>> 399bd3263170a79ed6cc677c98523419db316754

        }
        if (hidden.equals("") || hidden.equals(false)) {
            resultMap.put("ID", "false");
            resultMap.put("VIEW", "<form method='POST' th:action='@{/final/SignIn}'> <button type='submit' name='ID' class='text-muted bg-white border-0'>Sign In</button></form> <form method='POST' th:action='@{/final/SignUP}'> <button type='submit' class='text-muted bg-white border-0 b'>Sign Up</button> </form>");
            } else {
                resultMap.put("ID", hidden);
                resultMap.put("VIEW", "<button type='button' class='btn btn-primary'>로그인성공</button>");
            }
        
            modelandView.addObject("resultMap", resultMap);
            return modelandView;
    }

    @RequestMapping(value = "/final/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView action01(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/final/";
        Map<String, Object> resultMap = new HashMap<String, Object>();
<<<<<<< HEAD


        hidden = (String) paramMap.get("ID");
=======
      
        //메인에서 값넘겨줄때 에러
        // hidden = (String) paramMap.get("ID");
>>>>>>> 399bd3263170a79ed6cc677c98523419db316754

        if (hidden.equals("") || hidden.equals(false)) {
            resultMap.put("ID", false);
            resultMap.put("VIEW", "<button type='button' class='btn btn-primary'>로그인실패</button>");

        } else {
            resultMap.put("ID", hidden);
            resultMap.put("VIEW", "<button type='button' class='btn btn-primary'>로그인성공</button>");
        }

        viewName += action;
        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;
    }

}