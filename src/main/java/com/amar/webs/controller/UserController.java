/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.webs.controller;

import com.amar.webs.dao.Sec_userDAO;
import com.amar.webs.model.Sec_user;
import java.util.List;
import javax.annotation.Resource;
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
    
    @Resource(name = "sec_userDAO")
    Sec_userDAO sec_UserDAO;
    
    @RequestMapping(value = "/")
    public String tologin( HttpServletRequest request , HttpServletResponse response )
    {
        
        
        
        List<Sec_user> list = sec_UserDAO.getSec_user(new Sec_user());
        System.out.println("size:"+list.size());
        return "/login/tologin";
    }
    
    @RequestMapping(value = "/login")
    public String login( HttpServletRequest request , HttpServletResponse response )
    {
        //request.getSession().setAttribute(, this);
        return "/home/home";
    }
}
