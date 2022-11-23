package com.hp.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("${name}")
	String name;
	@Value("${age}")
	int age;
	@Value("${marks}")
	int marks;


	public Student() {
		System.out.println("This is Default Constructor of Student Class " + name);
	}

	public Student(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		System.out.println("This is Param Constructor of Student Class ");
	}

	public String getName() {
		System.out.println("This is Getter Method of Student Class " + name);
		return name;
	}

	public void setName(String name) {
		System.out.println("This is Setter Method of Student Class " + name);
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("This is Setter Method of Student Class " + age);
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}


}
