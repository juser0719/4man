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
// public class FINALController11 {

//     String hidden="";
//     boolean A = false;
//     @RequestMapping(value = "/final/home1")
//     public ModelAndView actionhome(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {

//         Map<String, Object> resultMap = new HashMap<String, Object>();

//         // if(A){
//         //     hidden = (String) paramMap.get("ID");
//         // }
//         // A= true;

//         // if (hidden.equals("") || hidden.equals(false)) {
//         //     resultMap.put("ID", "false");
//         //     resultMap.put("VIEW", "<button type='button' class='btn btn-primary'>로그인실패</button>");
//         // } else {
//         //     resultMap.put("ID", hidden);
//         //     resultMap.put("VIEW", "<button type='button' class='btn btn-primary'>로그인성공</button>");
//         // }

//         if(A){
            
//         }
//         if (hidden.equals("") || hidden.equals(false)) {
//             resultMap.put("ID", "false");
//             resultMap.put("VIEW", "<form method='POST' th:action='@{/final/SignIn}'> <button type='submit' name='ID' class='text-muted bg-white border-0'>Sign In</button></form> <form method='POST' th:action='@{/final/SignUP}'> <button type='submit' class='text-muted bg-white border-0 b'>Sign Up</button> </form>");
//             } else {
//                 resultMap.put("ID", hidden);
//                 resultMap.put("VIEW", "<button type='button' class='btn btn-primary'>로그인성공</button>");
//             }
        
//             modelandView.addObject("resultMap", resultMap);
//             return modelandView;
        

//     }

//     @RequestMapping(value = "/final/{action}1", method = { RequestMethod.GET, RequestMethod.POST })
//     public ModelAndView action01(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
//             ModelAndView modelandView) {
//         String viewName = "/final/";
//         Map<String, Object> resultMap = new HashMap<String, Object>();
      
//         //메인에서 값넘겨줄때 에러
//         // hidden = (String) paramMap.get("ID");

//         if (hidden.equals("") || hidden.equals(false)) {
//             resultMap.put("ID", false);
//             resultMap.put("VIEW", "<button type='button' class='btn btn-primary'>로그인실패</button>");

//         } else {
//             resultMap.put("ID", hidden);
//             resultMap.put("VIEW", "<button type='button' class='btn btn-primary'>로그인성공</button>");
//         }

//         viewName += action;
//         modelandView.setViewName(viewName);
//         modelandView.addObject("resultMap", resultMap);
//         return modelandView;
//     }

// }