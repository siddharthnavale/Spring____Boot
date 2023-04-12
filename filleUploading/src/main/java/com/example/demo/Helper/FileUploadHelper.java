package com.example.demo.Helper;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper{

	public final String upload_Dir="C:\\Users\\HP\\Desktop\\images";
	
	public boolean uploadFile(MultipartFile multipartFile) {
		
		boolean isUplaoaded=false;
		
		try {
			//1 way by stream
			//byte[] data=new byte[inputStream.available()];
			//inputStream.read(data);
			//FileOutputStream fos= new FileOutputStream(upload_Dir+"\\"+multipartFile.getOriginalFilename());
			//fos.write(data);
			//fos.close();
			//isUplaoaded=true;
			
			//2 way by NIO
			
			Files.copy(multipartFile.getInputStream(), Paths.get(upload_Dir+"\\"+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			isUplaoaded=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		return isUplaoaded;
		
	}
	
}
