package com.vscode.microsoftinit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    // This will handle page requests for home.jsp
    @RequestMapping("/home") // what path being requested
    //@ResponseBody // will print text that is returned!
    public String home() {
        System.out.println("hi from home!"); // this can be seen!, but page errors, need more code...

        // Return to page! magic.. Autoconfig finds the page automatically.
        return "home.jsp";
    }
}