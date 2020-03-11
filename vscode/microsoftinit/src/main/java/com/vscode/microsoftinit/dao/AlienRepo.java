package com.vscode.microsoftinit.dao;

import org.springframework.data.repository.CrudRepository;

import com.vscode.microsoftinit.model.Alien;

/* interface */

public interface AlienRepo extends CrudRepository<Alien, Integer>
{

}