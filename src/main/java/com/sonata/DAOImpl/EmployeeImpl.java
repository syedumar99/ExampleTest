package com.sonata.DAOImpl;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.sonata.DAO.EmployeeIntf;
import com.sonata.EModel.Employee;

public class EmployeeImpl implements EmployeeIntf{
		DBConnection db = new DBConnection();
	int row = 0;
	public int save(Object object) {
		Employee p1 = (Employee) object ;
		try {
			PreparedStatement s1 = db.getConnection().prepareStatement("insert into employee values(?,?)");
					
			s1.setInt(1,p1.getId());
			s1.setNString(2, p1.getName());
			row = s1.executeUpdate();
			db.closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return row;
	}
	@Override
	public List<Employee> getData() {
		// TODO Auto-generated method stub
		return null;
	}
}