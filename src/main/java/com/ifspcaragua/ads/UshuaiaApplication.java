package com.ifspcaragua.ads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication( scanBasePackages={"com.ifspcaragua.ads.repositories", 
		"com.ifspcaragua.ads.entities", "com.ifspcaragua.ads.rest"})
public class UshuaiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UshuaiaApplication.class, args);
	}

}
