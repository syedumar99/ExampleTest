package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sonata2.Calculator;

@SpringBootTest
class ExampleSonataApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void divTest() {
		Calculator c1 = new Calculator();
		int x = c1.div(1,1);
		assertThrows(ArithmeticException.class, ()->c1.div(1,0), "It is an error");
	}
		
	//@Test
	public void divTest1() {
		Calculator c1 = new Calculator();
		int x = c1.div(1,1);
		assertThrows(ArithmeticException.class, ()->c1.div(1,1), "It is an error");
	}

}
