package com.example.demo.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Person;

public interface PersonRepository extends JpaRepository<Person,Integer>{

}
