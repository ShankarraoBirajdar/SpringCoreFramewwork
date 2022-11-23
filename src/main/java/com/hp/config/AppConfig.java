package com.hp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hp.dao.Employee;
import com.hp.dao.Student;

@Configuration
@ComponentScan(basePackages = "com.hp.dao")
public class AppConfig {

	@Bean(name = {"studentbean"})
	public Student getStudent() {
		return new Student();
	}

	@Bean(name = {"employeebean"})
	public Employee getEmployee() {
       Employee employee =  new Employee();
		 employee.setStudent(getStudent());
		 return employee;
	}
}
