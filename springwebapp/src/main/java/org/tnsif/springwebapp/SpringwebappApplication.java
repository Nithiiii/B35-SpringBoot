package org.tnsif.springwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages="org.tnsif.srpingwebapp, + "org.tnsif.srpingwebapp.controller")
public class SpringwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebappApplication.class, args);
		int x=15;
		System.out.println(x);
	}

}