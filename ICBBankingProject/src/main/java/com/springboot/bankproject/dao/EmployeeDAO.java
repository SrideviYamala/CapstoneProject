package com.springboot.bankproject.dao;

import java.sql.SQLException;
import java.util.List;
import com.springboot.bankproject.model.Employee;

public interface EmployeeDAO {
	public List<Employee> showAllEmployees() throws SQLException; 
	
	public Employee getEmployeeById(Integer employeeId) throws SQLException;
	
	public Employee updateEmployee(Integer employeeId,String employeeName) throws SQLException;
	
	public boolean deleteEmployee(Integer employeeId)throws SQLException;
	
	public boolean createEmployee(Employee emp) throws SQLException;

	public List<Employee> showAllEmployeesByBankName(String bankName) throws SQLException;

	Employee updateEmployeeName(String name) throws SQLException;

	Employee getEmployeeByName(String employeeName) throws SQLException;
	
}
