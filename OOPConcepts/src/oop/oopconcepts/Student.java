package oop.oopconcepts;


public class Student extends Person implements PersonInterface {
	
	int studentID;
	double subject1;
	double subject2;
	double subject3;
	String major;
	
	
	 Student (int id, String name, int age, char gender, double subject1, double subject2, double subject3, String major){
	        super(name,age,gender);

	        this.studentID = id;
	        this.subject1 = subject1;
	        this.subject2 = subject2;
	        this.subject3 = subject3;
	        this.major = major;

	    }

	    public void display() {
	        System.out.println(ORGANIZATION);
	        super.display();

	        System.out.println("id :" + this.studentID);
	        System.out.println("subject1: " + this.subject1 );
	        System.out.println("subject2: " + this.subject2 );
	        System.out.println("subject3: " + this.subject3 );
	        System.out.println("major: " + this.major );

	    }

	    public double calculate (int student_totalScore) {
	        double average = ((this.subject1+this.subject2+this.subject3)/student_totalScore);
	        return average;
	    }

	    public void check() {
	    	
	    	if(this.major.contains("Science"));
	    	
	    	System.out.println("The student is in the science department.");
	    	
	    	
	    }
	}




