package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.comments.CommentLine;

import com.example.demo.Entity.Category;
import com.example.demo.Entity.Product;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Repository.ProductRepository;

@SpringBootApplication
public class ManyToManyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

	
	@Autowired
	private CategoryRepository categoryRepository;		
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Product product1 = new Product();
		product1.setProductId("p1");
		product1.setProductName("TV");
		
		Product product2 = new Product();
		product2.setProductId("p2");
		product2.setProductName("Mobile");
		
		Product product3 = new Product();
		product3.setProductId("p3");
		product3.setProductName("T- shirt");
		
		Category category1 =new Category();
		category1.setCategoryId("c1");
		category1.setCategoryName("LatestProducts");
		
		Category category2 =new Category();
		category2.setCategoryId("c2");
		category2.setCategoryName("cloths");
		
		List<Product> category1products = category1.getProducts();
		category1products.add(product1);
		category1products.add(product2);
		category1products.add(product3);
		
		List<Product> category2products = category2.getProducts();
		category2products.add(product3);
		
		categoryRepository.save(category1);
		categoryRepository.save(category2);
		
		}

}
