package com.capgemini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project2Application implements CommandLineRunner {

	// Injecting the object :: Injecting the dedepndent object
	// Injecting Dependecies :: Dependeincy INjection
	@Autowired
	private  DBUtil dbutil;
	
	@Autowired
	private DBUtil dbutil1;
	
	@Autowired
	private Employee employee;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		System.out.println(dbutil);
		System.out.println(dbutil1);
		System.out.println(employee);
	}

}
