package com.vscode.microsoftinit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vscode.microsoftinit.dao.AlienRepo;
import com.vscode.microsoftinit.model.Alien;
/*
    In MVC, this is the controller
*/ 
@Controller
public class AlienController
{
    // Will look for the object and create it automatically.
    // You don't have to implement this interface! Spring handles it.
    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String model()
    {
        System.out.println("Model being called");
        // Working with JSP files requires JASPER from Tomcat on mvn/gradle repository
        return "model";

        // Add many objects to one view. Easy and clean.
        //ModelAndView mv = new ModelAndView();
        //mv.setViewName("model");
        //return mv;
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien)
    {
        repo.save(alien);
        return "add";
    }

}