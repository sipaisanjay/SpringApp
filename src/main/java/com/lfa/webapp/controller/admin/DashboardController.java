/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.webapp.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sanjay07
 */
@Controller
@RequestMapping(value = "/admin")
public class DashboardController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "admin/dashboard/index";
    }
    
}
