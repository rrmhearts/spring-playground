package com.vscode.microsoftinit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
    In MVC, this is the controller
*/ 
@Controller
public class ModelController
{
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
        return "add";
    }

}