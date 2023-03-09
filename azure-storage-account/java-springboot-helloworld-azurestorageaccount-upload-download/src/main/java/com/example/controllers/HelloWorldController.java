package com.example.controllers;

import java.util.List;

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
	public HelloWorldJson helloWorld() {
		
		List<String> listFiles = azureStorageAccountService.listFiles();
		for (String file : listFiles) {
			System.out.println(file);
		}
		
		logger.info("Application was called with message: {}", "null");
		
		return new HelloWorldJson(null);
		
	}
	
}
