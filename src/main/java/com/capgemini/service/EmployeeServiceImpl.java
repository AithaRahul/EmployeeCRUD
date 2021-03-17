package com.capgemini.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.beans.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> emps = new ArrayList<>(Arrays.asList(new Employee("101", "Sai", "Consultant", 30000),
			new Employee("102", "Somu", "Senior Consultant", 40000), new Employee("103", "Vihari", "Manager", 50000)));

	@Override
	public List<Employee> getAllEmployees() {
		return emps;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		emps.add(emp);
		return emp;
	}

	@Override
	public Employee getEmployeeById(String id) {
		return emps.stream().filter(e -> e.getId().equals(id)).findFirst().get();
	}

	@Override
	public void deleteEmployee(String id) {
		emps.removeIf(e -> e.getId().equals(id));
	}

	@Override
	public Employee updateEmployee(String id, Employee emp) {

		for (int i = 0; i < emps.size(); i++) {
			Employee e = emps.get(i);
			if (e.getId().equals(id)) {
				emps.set(i, emp);
			}
		}
		return emp;
	}
}