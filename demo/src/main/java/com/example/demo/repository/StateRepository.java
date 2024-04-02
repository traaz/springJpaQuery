package com.example.demo.repository;

import com.example.demo.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StateRepository extends JpaRepository<State, Integer> {

    List<State> findByCountryId(int id);

    @Query(value = "Select s from State s join Country c on s.country.id = c.id")
    List<State> getStateCountry();

    @Query(value = "Select u from State u where u.name like 'A%'")
    List<State> getStateStartKeywordA();


    //calismiyor
    @Query(value = "Select u from State u where u.name like 'u.name=:keyword%'")
    List<State> getStateStartKeyword(@Param("keyword") String keyword);

    @Query(value = "Select u from State u order by u.id desc")
    List<State> getStateDesc();

    @Query(value = "Select u from State u where name=:val")
    State getStateFromParam(@Param("val") String name);

    @Query(value = "Select s.country.name,Count(s.name) from State s group by s.country.name")
    List<String> groupByCountry();

}
