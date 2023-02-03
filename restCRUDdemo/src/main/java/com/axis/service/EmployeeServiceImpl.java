package com.axis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.entity.Employee;
import com.axis.exception.IdNotFoundException;
import com.axis.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired 
	EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
//		employeeRepository.findById(id).get();
		
       Optional<Employee> employee = employeeRepository.findById(id);
		
		if(employee.isPresent())
		return employee.get();
		else 
			throw new IdNotFoundException("No Id present to get the value");		
	}

	@Override
	public Employee updateEmployeeById(int id, Employee employee) {
		// TODO Auto-generated method stub
		Optional<Employee> empl = employeeRepository.findById(id);
		
		if(empl.isPresent())
			return employeeRepository.save(employee);
		else
			throw new IdNotFoundException("No id presnt to update");
	}

	@Override
	public String deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> empl = employeeRepository.findById(id);
		
		if(empl.isPresent()) {
			employeeRepository.deleteById(id);
			return "Employee is deleted";
			
		}else 
			return "No id present to delete";
	}
	
	


}
