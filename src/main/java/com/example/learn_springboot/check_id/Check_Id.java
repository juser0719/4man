package com.example.learn_springboot.check_id;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Check_Id {
    @RequestMapping(value = "/check_id/testhome", method = RequestMethod.GET)
    public void ac() {
    }

    @RequestMapping(value = "/check_id/{action}", method = RequestMethod.GET)
    public ModelAndView action01(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/check_id/";
        Map<String, Object> resultMap = new HashMap<String, Object>();

        String hidden = (String) paramMap.get("ID");

        if (hidden.equals("") || hidden.equals(false)) {
            resultMap.put("ID", false);

            resultMap.put("VIEW", "<button type='button' class='btn btn-primary'>값없다</button>");
        } else {
            if (action.equals("testhome") || action.equals("testsub1")) {
                resultMap.put("ID", hidden);
                resultMap.put("VIEW", "<button type='button' class='btn btn-primary'>값있당</button>");
                resultMap.put("WELCOME", "<p class='btn btn-primary'>환영합니다</p>");
            }
        }

        viewName += action;

        // if (action.equals("testsub1")) {
        // viewName += action;
        // resultMap.put("ID", hidden);

        // } else if (action.equals("testsub2")) {
        // if (((String) paramMap.get("ID")).equals("qq")) {
        // viewName += action;
        // resultMap.put("ID", hidden);
        // } else {
        // viewName += "testsub1";
        // }
        // }

        /*
         * hidden = (String) paramMap.get("ID"); if (((String)
         * paramMap.get("ID")).equals("qq")) { resultMap.put("AUTHORIZATION", true); }
         * else{ resultMap.put("AUTHORIZATION", false); }
         */

        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;
    }
}