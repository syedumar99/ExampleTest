package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.impl.DefaultAddition;

@SpringBootApplication
public class ExampleSonataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleSonataApplication.class, args);
		AddInterface addition = new DefaultAddition();
		System.out.println(addition.add(10, 20));
	}

}
