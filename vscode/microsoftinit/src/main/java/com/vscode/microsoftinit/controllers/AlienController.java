package com.vscode.microsoftinit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
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
        return "model";
    }

    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid)
    {
        ModelAndView mv = new ModelAndView("show"); // set view name
        
        Alien alien = repo.findById(aid).orElse(new Alien());
        System.out.println(repo.findByAname("Wendy"));
        System.out.println(repo.findByTech("Java"));
        System.out.println(repo.findByAidGreaterThan(102));
        System.out.println(repo.findByTechSorted("Ruby"));

        /* Sysouts return::
[Alien [aid=103, aname=Wendy]]
[Alien [aid=104, aname=Bella]]
[Alien [aid=103, aname=Wendy], Alien [aid=104, aname=Bella], Alien [aid=105, aname=Hannah]]
[Alien [aid=105, aname=Hannah]]
        */

        mv.addObject(alien);
        return mv;
    }

    public List<Alien> listAliens() {
        List<Alien> aliens = new ArrayList<>();
        repo.findAll().forEach(aliens::add);
        return aliens;        
    }

    /*
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable int aid)
	{
		Alien a = repo.getOne(aid);
		repo.delete(a);
		return "deleted";
	}
	
	@PostMapping(path="/alien",consumes= {"application/json"})
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	@GetMapping(path="/aliens")
	public List<Alien> getAliens()
	{
		return repo.findAll();
			
	}
	@PutMapping(path="/alien",consumes= {"application/json"})
	public Alien saveOrUpdateAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	
	@RequestMapping("/alien/{aid}")
	public Optional<Alien> getAlien(@PathVariable("aid")int aid)
	{
		return repo.findById(aid);
		
		
	}

    */


}