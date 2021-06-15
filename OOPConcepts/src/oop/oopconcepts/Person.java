package oop.oopconcepts;

public class Person {
	
	static int count=0;
	
	String personName;
	int personAge;
	char personGender;
	
	public Person(String name, int age, char gender) {
		personName = name;
		personAge = age;
		personGender = gender;
		
		count++;
	}

	
	public void display() {
		System.out.println("Name : " +this.personName);
		System.out.println("Age : " +this.personAge);
		System.out.println("Gender :" +this.personGender);
	}
	
	public static void totalPerson() {
		System.out.println("total amount of person objects: " +count);
	}
}
