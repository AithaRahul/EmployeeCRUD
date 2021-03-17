package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee addEmployee(Employee emp);

	public Employee getEmployeeById(String id);

	public void deleteEmployee(String id);

	public Employee updateEmployee(String id, Employee emp);

}