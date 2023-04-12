package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.Helper.FileUploadHelper;

@RestController
public class ImageUploadController {
	
	@Autowired
	private FileUploadHelper fileUploadHelper;
	
	
	
	@PostMapping("/Upload_Image")
	public ResponseEntity<String> uploadfile(@RequestParam("image1") MultipartFile file){
		
	//	System.out.println(file.getOriginalFilename());
	//	System.out.println(file.getSize());
	//	System.out.println(file.getContentType());
	//	System.out.println(file.getName());
		
		try {
				
		if(file.isEmpty()) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
					body("Request must contain file");
		}
		
		 if (!file.getContentType().equals("image/jpeg")) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
					body("Only JPEG Content are allowed");
		}
		 
		 boolean isUploaded=fileUploadHelper.uploadFile(file);
		 if (isUploaded){
			//return ResponseEntity.ok("File is Uploaded Successfully");
			 return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().
					path("/image/").path(file.getOriginalFilename()).toUriString());
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
				body("Something went wrong. Try again");
		
	}
	

}
