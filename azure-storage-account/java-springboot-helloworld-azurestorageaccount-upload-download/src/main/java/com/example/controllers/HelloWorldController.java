package com.example.controllers;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsons.HelloWorldJson;
import com.example.services.AzureStorageAccountService;

@RestController
public class HelloWorldController {
	
	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	private AzureStorageAccountService azureStorageAccountService;

	@Autowired
	public HelloWorldController(AzureStorageAccountService azureStorageAccountService) {
		this.azureStorageAccountService = azureStorageAccountService;
	}



	@RequestMapping(value="/")
	public HelloWorldJson helloWorld() throws FileNotFoundException {
		
		File file = new File(getClass().getClassLoader().getResource("helloworld.txt").getFile());
		azureStorageAccountService.uploadFile(file.getName(), new FileInputStream(file), file.length());
		ByteArrayOutputStream baos = azureStorageAccountService.downloadFile(file.getName());
		String message = baos.toString();
		
		logger.info("Application was called with message: {}", message);
		
		return new HelloWorldJson(message);
		
	}
	
}
