package com.hp.dao;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("employeebean")
@PropertySource("classpath:data.properties")
public class Employee {

	@Autowired
	public Student student;
	
	@Value("#{student}")
	List<Student> students;
	
	@Value("${stringList}")
	List<String> stringList;
	
	@Value("${stringSet}")
	Set<String> stringSet;
	
	@Value("#{${valuesMap}}")
	Map<String,Integer> map;

	public Employee() {
		System.out.println("This is Default Constructor of Employee Class ");
	}


	
	public Employee(Student student, List<Student> students, List<String> stringList, Set<String> stringSet,
			Map<String, Integer> map) {
		super();
		this.student = student;
		this.students = students;
		this.stringList = stringList;
		this.stringSet = stringSet;
		this.map = map;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<String> getStringList() {
		return stringList;
	}

	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}

	public Set<String> getStringSet() {
		return stringSet;
	}

	public void setStringSet(Set<String> stringSet) {
		this.stringSet = stringSet;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Employee [student=" + student + ", students=" + students + ", stringList=" + stringList + ", stringSet="
				+ stringSet + ", map=" + map + "]";
	}

}
