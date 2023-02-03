package com.axis;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.axis.entity.Employee;
import com.axis.repository.EmployeeRepository;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner{

	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Employee employee1 = new Employee(1, "Ajay", 23 ,"IT", 45000.0);
//		employeeRepository.save(employee1);
//		
//		Employee employee2 = new Employee(2, "Omkar", 24 ,"ENTC", 55000.0);
//		employeeRepository.save(employee2);   // To save the passed parameters in a table
		
//		To get all details
		
		List<Employee> employees = employeeRepository.findAll();
		 // Iteration methods using for each loop
		
		for(Employee employee2 : employees)
		  System.out.println(employee2.getId()+" "+employee2.getName());
		
		
		// To search Employee by Id
		
		 Optional<Employee> emp= employeeRepository.findById(1);
		 if(emp.isPresent())
		{
		 Employee e = emp.get();
		 System.out.println(e.getId() +" "+ e.getName() +" "+ e.getAge() +" "+ emp.get().getDept());
		}
		else
		 System.out.println("no employee found for the given id");
		
		
	}
	

}
