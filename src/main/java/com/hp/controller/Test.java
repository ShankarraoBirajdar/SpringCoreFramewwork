package com.hp.controller;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;

import com.hp.config.AppConfig;
import com.hp.dao.Employee;
import com.hp.dao.Student;

public class Test {

	public static ApplicationContext context;
	public static void main(String[] args) {

		/* using BeanFactory */
//		Resource resource = new ClassPathResource("com\\hp\\config\\applicationContext.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		Employee employee = (Employee) factory.getBean("employeebean");
//		System.out.println(employee.toString());

//		       /* using ApplicationContext*/
		System.out.println("Enter Below Option");
		System.out.println("1. xml Config");
		System.out.println("2. annotation Config");
		Scanner sc = new Scanner(System.in);
		int config = sc.nextInt();
		switch (config) {
		case 1:
			context = new ClassPathXmlApplicationContext("com/hp/config/applicationContext.xml");
			break;
		case 2:
			context = new AnnotationConfigApplicationContext(com.hp.config.AppConfig.class);
			break;
		}
		Employee employee = (Employee) context.getBean("employeebean");
		System.out.println(employee.toString());

//		Employee employee = context.getBean("employee", Employee.class);
//		employee.employeeMethod();
//		employee.student.studentMethod();

//	    student.setName("Priyanka Birajdar");
//	    student.setAge(26);
//	    student.setRollNo(102);
//		System.out.println(student.toString());

	}

}
