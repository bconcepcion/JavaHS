package oop.oopconcepts;
import java.util.Scanner;

public class Starter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		//Employee
		
		System.out.println("Employee Info");
		
		System.out.println("Enter employee ID");
		
		int employeeID = input.nextInt();
		
		System.out.println("Enter Name");
		String fullName =  input.next(); 
		
		System.out.println("Enter age: ");
		int age =  input.nextInt(); 
		
		System.out.println("Enter gender: ");
		char gender =  input.next().toUpperCase().charAt(0);
		
		System.out.println("Enter salary: ");
		double salary = input.nextDouble();
		
		System.out.println("Enter bonus: ");
		int bonus = input.nextInt();
		
		System.out.println("Enter charitable contribution");
		float contribution = input.nextFloat();  
		
	
		//creating employee object
		
		Employee employee1 = new Employee(employeeID, fullName, age, gender, salary,contribution, bonus);
		
		employee1.display();
		
		
		//Student
		
		System.out.println("Enter Student Info");
		
		System.out.println("Enter student ID");
		int studentID = input.nextInt();
		
		System.out.println("Enter student name");
		String studentName = input.next();
		
		System.out.println("Enter age");
		int studentAge = input.nextInt();
		
		System.out.println("Enter Student Gender");
		char studentGender = input.next().toUpperCase().charAt(0);
		
		System.out.println("Student Grades");
		System.out.println("Enter grades on 4.0 scale");
		
		System.out.println("Enter grades for first subject");
		double subject1 = input.nextDouble();
		
		System.out.println("Enter grades for second subject");
		double subject2 = input.nextDouble();
		
		System.out.println("Enter grades for third subject");
		double subject3 = input.nextDouble();
		
		System.out.println("Enter Student Major");
		String major = input.next();
		
		

		//creating student object
		
		Student studentOne = new Student(studentID, studentName, studentAge, studentGender, subject1, subject2, subject3, major);
		
		studentOne.display();
		
		
		
		//Person 1
		
		Person1 personOne = new Person1();
		
		System.out.println("Enter name");
		personOne.setName(input.next().trim());
		
		System.out.println("Enter age");
		personOne.setPersonAge(input.nextInt());
		
		System.out.println("Enter hobby");
		personOne.setHobby(input.next());
		
		
		input.close();
	
	}
	

}
