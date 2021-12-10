package com.sound.controller.authority.authorize;

import com.sound.service.authorize.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/vue-element-admin/user")
public class Login {

    @Autowired
    private LoginService loginService;

    /**
     * 创建文章
     * @param params
     * @return
     */
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String login(@RequestBody String params){
        return loginService.login();
    }


    /**
     * 创建文章
     * @param params
     * @return
     */
    @RequestMapping(value = "/info", method = {RequestMethod.GET})
    public String info(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request.getParameter("token"));
        return loginService.info();
    }



}
