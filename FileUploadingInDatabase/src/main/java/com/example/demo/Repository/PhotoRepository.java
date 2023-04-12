package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Photo;

public interface PhotoRepository extends JpaRepository<Photo, String>{

}
