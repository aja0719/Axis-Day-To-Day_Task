package com.axis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.entity.Employee;
import com.axis.exception.IdNotFoundException;
import com.axis.exception.InvalidAgeException;
import com.axis.exception.InvalidSalaryException;
import com.axis.repository.EmployeeRepository;

@Service  //<bean id="empser class="">
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		if(employee.getAge()<=22)
			throw new InvalidAgeException("minimu age should be 23 or above");
		if(employee.getSalary()<=100)
			throw new InvalidSalaryException("Salary is not suff.");
		return employeeRepository.save(employee);
		
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
	Optional<Employee>	emp =  employeeRepository.findById(id);
	
	if(emp.isPresent())
		return emp.get();
	else
		throw new IdNotFoundException("no id present to get the value");
	}

	@Override
	public Employee updateEmployeeById(int id, Employee employee) {
		
		Optional<Employee>	emp =  employeeRepository.findById(id);
		
		if(emp.isPresent())
			 return employeeRepository.save(employee);
		else
			throw new IdNotFoundException("no id present to update");

	}

	@Override
	public String deleteEmployeeById(int id) {
		Optional<Employee>	emp =  employeeRepository.findById(id);
		
		if(emp.isPresent())
		{
			employeeRepository.deleteById(id);
			return "employee deleted";
		}
		else
			throw new IdNotFoundException("no id present to delete");

		
	}

	

}