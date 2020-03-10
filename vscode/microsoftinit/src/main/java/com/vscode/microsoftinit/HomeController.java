package com.vscode.microsoftinit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
    In MVC, this is the controller
*/ 
@Controller
public class HomeController
{
    // This will handle page requests for home.jsp
    @RequestMapping("/home") // what path being requested
    //@ResponseBody // will print text that is returned!
    // Any object can be passed into the view!
    public ModelAndView home(Alien alien) { // automatically will pass request query...
        // Assign the param "name" to the variable myName

        // Add many objects to one view. Easy and clean.
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", alien);
        mv.setViewName("home");

        return mv;
    }
}