/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.webs.controller;

import com.amar.webs.dao.SecUserMapper;
import com.amar.webs.model.SecUser;
import com.amar.webs.model.SecUserExample;
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
    
    //@Resource(name = "sec_userDAO")
    //Sec_userDAO sec_UserDAO;
    @Resource(name = "secUserMapper")
    SecUserMapper secUserMapper;
    
    
    @RequestMapping(value = "/tologin")
    public String tologin( HttpServletRequest request , HttpServletResponse response )
    {
        
        //System.out.println("size:"+list.size());
        return "/login/tologin";
    }
    
    @RequestMapping(value = "/login")
    public String login( HttpServletRequest request , HttpServletResponse response )
    {
        String loginname = request.getParameter("loginname");
        String pw = request.getParameter("pw");
        SecUserExample secUserExample = new SecUserExample();
        
        secUserExample.createCriteria().andLoginnameEqualTo(loginname).andPwEqualTo(pw);
        List<SecUser> list = secUserMapper.selectByExample(secUserExample);
        
        if (list != null && list.size() == 1) {
            request.getSession().setAttribute("user", list.get(0));
            return "/home/home";
        } else {
            request.setAttribute("login", "fail");
            return "/login/tologin";
        }
        
    }
}
