package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Scope(value="prototype")
public class Employee {
	private String emp_name;
	private int age, charitableContribution;
	String employee_id;
    private double employee_salary;
    
    @Autowired
    @Qualifier("laptop")
    private Laptop laptop;
    
    public Laptop getLaptop() {
    	return laptop;
    }
    
    public void setLaptop(Laptop laptop) {
    	this.laptop = laptop;
    }

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public int getCharitableContribution() {
		return charitableContribution;
	}

	public void setCharitableContribution(int charitableContribution) {
		this.charitableContribution = charitableContribution;
	}

	public double getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}
	
	
	public void rate() {
		double hRate = employee_salary / 261;
		double cRate = Math.round(hRate*100)/100.0;
		
		System.out.println("Hourly rate is: " + cRate);
		
		
	}
    
    


}
