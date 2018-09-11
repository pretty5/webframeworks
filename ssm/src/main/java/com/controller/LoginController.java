package com.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("login.do")
    public ModelAndView login(String name, String password, ModelAndView mav,HttpServletRequest req){

        if (StringUtils.isBlank(name) || StringUtils.isBlank(password)){
            mav.setViewName("error");
            return mav;
        }
        if (name.equals("zhangsan")&&password.equals("123")){
            HttpSession session = req.getSession();
            session.setAttribute("name","zhangsan");
            mav.setViewName("success");
            return mav;
        }
            return  mav;
    }
}
