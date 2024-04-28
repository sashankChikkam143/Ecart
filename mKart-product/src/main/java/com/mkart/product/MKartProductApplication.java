package com.mkart.product;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MKartProductApplication {
	
	@Bean
	public ModelMapper  mapper()
	{
		return new  ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(MKartProductApplication.class, args);
	}

}
