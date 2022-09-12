package com.sonata.DAO;

import java.util.List;

import com.sonata.EModel.Employee;

public interface EmployeeIntf {
	public int save(Object object);
	public List<Employee> getData();
	
}
