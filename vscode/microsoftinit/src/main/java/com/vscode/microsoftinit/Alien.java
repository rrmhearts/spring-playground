package com.vscode.microsoftinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") // will use Prototype scope instead of Singleton. Will create multiple objects as called
public class Alien {
    private int aid;
    private String aname;
    private String tech;

    @Autowired // searches by class type!
    @Qualifier("lap1") // named it lap1 in Laptop, searches by name!
    private Laptop laptop; // force alien to search for object in Spring container!

    public Alien() {
        super();
        System.out.println("object created");
    }
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void show() {
        System.out.println("in show");

        // How does Alien know that his laptop is instantiated as an object?
        laptop.compile();
    }
    
}