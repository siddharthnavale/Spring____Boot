package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;

@SpringBootApplication
public class AnnotationBuilderApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AnnotationBuilderApplication.class, args);
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
			List<Student> students = new ArrayList<>();
			students.add(Student.builder().name("Pratik").city("UK").build());
			students.add(Student.builder().name("Neha").city("UK").build());
			students.add(Student.builder().name("Shubham").city("Scotland").build());
			students.add(Student.builder().name("Rex").city("US").build());
			students.add(Student.builder().name("Doremon").city("China").build());
			students.add(Student.builder().name("chota bhim").city("India").build());
			students.add(Student.builder().name("Ash").city("Thailand").build());
			students.add(Student.builder().name("Popeye").city("Scotland").build());
			students.add(Student.builder().name("Shinchan").city("China").build());
			students.add(Student.builder().name("Johnny Bravo").city("US").build());
			students.add(Student.builder().name("Scooby Doo").city("US").build());
			students.add(Student.builder().name("Korra").city("China").build());
			students.add(Student.builder().name("Katara").city("China").build());
			students.add(Student.builder().name("Aang").city("China").build());
			students.add(Student.builder().name("SpongeBob").city("US").build());
			students.add(Student.builder().name("Tom").city("India").build());
			students.add(Student.builder().name("Jerry").city("India").build());
			students.add(Student.builder().name("Mickey Mouse").city("Thailand").build());
			students.add(Student.builder().name("Pooh").city("Thailand").build());

		
		}
		
	}


