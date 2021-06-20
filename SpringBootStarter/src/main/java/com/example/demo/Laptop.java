package com.example.demo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Laptop {
 private int lID;
 private String brand;
 
 
 
 public Laptop (){
	 System.out.println("");
 }
 
 public int getLid() {
	return lID;
}



public void setLid(int lID) {
	this.lID = lID;
}



public String getBrand() {
	return brand;
}



public void setBrand(String brand) {
	this.brand = brand;
}


	
@Override
public String toString() {
	return "Laptop [lid=" + lID + ", brand=" + brand + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}



public static void brandname() {
	System.out.println("");
}


}
