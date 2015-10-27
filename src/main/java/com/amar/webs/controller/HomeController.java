/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.webs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author amar
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    
    @RequestMapping(value = "/toHome")
    public String toHome(){
        return "home/home";
    }
    
    @RequestMapping(value = "/toLogin")
    public String toHome2(){
        return "login/tologin";
    }
    
}
