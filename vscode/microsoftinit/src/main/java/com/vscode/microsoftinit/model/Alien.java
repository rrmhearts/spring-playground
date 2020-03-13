package com.vscode.microsoftinit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.xml.bind.annotation.XmlRootElement;

@Entity
//@XmlRootElement
public class Alien
{
    @Id
    private int aid;
    private String aname;
    private String tech;

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

    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + "]";
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

}