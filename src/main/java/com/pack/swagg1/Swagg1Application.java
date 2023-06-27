package com.pack.swagg1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.pack.swagg1.model.*;
import com.pack.swagg1.repository.Bankrepository;
import com.pack.swagg1.service.Bankservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Swagg1Application implements CommandLineRunner{
	
	@Autowired
	Bankservice bankser;

	@Autowired
	Bankrepository bankr;
	
	public static void main(String[] args) {
		SpringApplication.run(Swagg1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Bank l = new Bank(1,"andhrabank");
		bankr.save(l);
	}
	
	

}
