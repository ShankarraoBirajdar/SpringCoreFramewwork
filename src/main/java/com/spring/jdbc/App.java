package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		JdbcTemplate jt = context.getBean("jdbcTemplate", JdbcTemplate.class);

		// insert Query
		String query = "insert into Student(id,name,city) values(?,?,?)";

		int i = jt.update(query, 4, "Aadi", "Vinchur");
		
		if (i > 0)
			System.out.println("Record inserted ");
		else
			System.out.println("Record Not inserted ");

	}

}
