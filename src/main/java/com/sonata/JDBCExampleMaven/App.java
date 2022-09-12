package com.sonata.JDBCExampleMaven;


import com.sonata.DAOImpl.EmployeeImpl;
import com.sonata.EModel.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Employee s1 = new Employee();
    	s1.setId(14);
    	s1.setName("Umar");
    	
    	EmployeeImpl p1 = new EmployeeImpl();
    	int a1 = p1.save(s1);    	
    	System.out.println(a1);
    	/*List<Student> s2 = p1.getData();    	
        for(int i=0;i <s2.size();i++) {
        	System.out.println(s2.get(i).getId());
        	System.out.println(s2.get(i).getName());
        }*/
    }
}
