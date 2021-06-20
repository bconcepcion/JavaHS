package com.example.demo;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ConfigurableApplicationContext Context = SpringApplication.run(DemoApplication.class, args);
		
		String pname = null, pname1 = null;
		int pid = 0;
		
		
		System.out.println("SpringBoot app is running");
		
		//creating/injecting object into p1
		Person p1 = Context.getBean(Person.class);
		System.out.println("Name: ");
		pname = scan.nextLine();
		
		System.out.println("id: ");
		p1.setPid(pid);
		
		p1.show();
		
		//
		Person p2 = Context.getBean(Person.class);
		System.out.println("Name: ");
		
		scan.nextLine();
		pname = scan.nextLine();
		
		p2.setPname(pname1);
		
		System.out.println("Person ID: ");
		p2.setPid(pid);
		p2.show();
		
		//
		
		String employeeName, employeeID;
		
		
		
		Employee emp1 = Context.getBean(Employee.class);
		System.out.println("Employee Name: ");
		
		scan.nextLine();
		employeeName = scan.nextLine();
		
		emp1.setEmp_name(employeeName);
		
		System.out.println("Employee ID: ");
		employeeID = scan.nextLine();
		
		emp1.setEmployee_id(employeeID);
		
	}

}


