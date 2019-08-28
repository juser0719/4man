// package com.example.learn_springboot.controller;

// import java.util.HashMap;
// import java.util.Map;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;





// @Controller
// public class FINALController2222 {

//     String hidden="";
//     boolean A=true;
//     @RequestMapping(value = "/final/home")
//     public ModelAndView actionhome(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {

//         Map<String, Object> resultMap = new HashMap<String, Object>();

//         if(paramMap.get("ID")==null || paramMap.get("ID").equals("")){
//             resultMap.put("VIEW", "<button type='submit' name='ID' class='text-muted bg-white border-0 b'>Sign In</button>");
//             resultMap.put("ID", "");
//         }
//         else if(!paramMap.get("ID").equals("")){
//             A = false;
//             hidden = (String)paramMap.get("ID");
//             resultMap.put("VIEW", "ㅁㅁ");
//             resultMap.put("ID", hidden);
//         }
//         else{

//         }

//             modelandView.addObject("resultMap", resultMap);
//             return modelandView;
        

//     }

//     @RequestMapping(value = "/final/{action}", method = { RequestMethod.GET, RequestMethod.POST })
//     public ModelAndView action01(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
//             ModelAndView modelandView) {
//         String viewName = "/final/";
//         Map<String, Object> resultMap = new HashMap<String, Object>();
      

//         if(paramMap.get("ID")==null || paramMap.get("ID").equals("")){
//             resultMap.put("VIEW", "<button>실패</button>");
//             resultMap.put("ID", "");
//         }
//         else{
//             resultMap.put("VIEW", "<button>성공</button>");
//             resultMap.put("ID", hidden);
//         }

        

//         viewName += action;
//         modelandView.setViewName(viewName);
//         modelandView.addObject("resultMap", resultMap);
//         return modelandView;
//     }

// }