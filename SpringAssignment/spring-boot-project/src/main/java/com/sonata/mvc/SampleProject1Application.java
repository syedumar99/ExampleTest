package com.sonata.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@ComponentScan({"com.sonata.controller"})
@SpringBootApplication(scanBasePackages={"com.sonata.controller", "com.sonata.mvc"})
public class SampleProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleProject1Application.class, args);
	}

}
