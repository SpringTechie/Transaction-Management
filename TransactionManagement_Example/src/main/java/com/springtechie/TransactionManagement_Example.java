package com.springtechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableTransactionManagement
public class TransactionManagement_Example{

	public static void main(String[] args) {
		SpringApplication.run(TransactionManagement_Example.class, args);
		
	}
	

}
