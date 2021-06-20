package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value="prototype")
public class Person {
	
	private int pid;
	private String pname;
	private String tech;
	
	@Autowired
	@Qualifier("laptop") 
	
	private Laptop laptop;
	
	public Person() 
	{
//	System.out.println("Object created");
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void show() {
//		System.out.println("inside person class show method..");
		Laptop.brandname();
	}
	
	

}
