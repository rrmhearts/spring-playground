package com.vscode.microsoftinit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.vscode.microsoftinit.model.Alien;

/* interface 
    JpaRepository extends CrudRepository and provies many extra features.
    * findAll feature
*/

public interface AlienRepo extends JpaRepository<Alien, Integer>
{
    // This does what it says by magic.
    // Black magic, auto adds these find methods based on the name of the function
    List<Alien> findByAname(String name);
    List<Alien> findByTech(String tech);
    List<Alien> findByAidGreaterThan(int aid);

    // You can also write your own interface, custom function names. using JPQL
    @Query("from Alien where tech=?1 order by aname") // ?1 first parameter
    List<Alien> findByTechSorted(String tech);
}