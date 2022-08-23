package com.sonata.Main;

import com.sonata.Impl.EmpImpl;
import com.sonata.Model.Employee;

public class EmpExe {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmpId(123);
		e1.setEmpName("umar");
		e1.setEmpSal(500);
		
		EmpImpl e2 = new EmpImpl();
		System.out.println(e2.yearlySal(e1));
		System.out.println(e2.appSal(e1));
	}

}
