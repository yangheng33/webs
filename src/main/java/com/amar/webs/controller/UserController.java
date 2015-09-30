/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.webs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author amar
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "/tologin")
    public String tologin( HttpServletRequest request , HttpServletResponse response )
    {
        
        return "/login/tologin";
    }
    
    @RequestMapping(value = "/login")
    public String login( HttpServletRequest request , HttpServletResponse response )
    {
        //request.getSession().setAttribute(, this);
        return "/home/home";
    }
}
