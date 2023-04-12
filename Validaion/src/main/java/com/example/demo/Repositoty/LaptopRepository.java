package com.example.demo.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer>  {

}
