package com.vscode.microsoftinit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
    In MVC, this is the controller
*/ 
@Controller
public class HomeController
{
    // This will handle page requests for home.jsp
    @RequestMapping("/home") // what path being requested
    //@ResponseBody // will print text that is returned!
    public String home(HttpServletRequest req, HttpServletResponse res) { // automatically will pass request query...

        String name = req.getParameter("name");

        System.out.println("hi from " + name +"!"); // this can be seen!, but page errors, need more code...

        // Return to page! magic.. Autoconfig finds the page automatically.
        // pass query to jsp..
        HttpSession session = req.getSession();
        session.setAttribute("name", name); // key value added to session... to get in jsp
        return "home";
    }
}