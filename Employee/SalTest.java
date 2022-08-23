package com.sonata2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.sonata.Impl.EmpImpl;
import com.sonata.Model.Employee;



public class SalTest {
	
	@Test
	public void SalTest1() {
		Employee e3 = new Employee();
		EmpImpl e4 = new EmpImpl();
		e3.setEmpSal(100);
		double a = e4.yearlySal(e3);
		Assertions.assertEquals(1200,a);
	}


}