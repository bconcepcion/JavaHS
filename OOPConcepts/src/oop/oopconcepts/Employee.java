package oop.oopconcepts;

public class Employee extends Person implements PersonInterface {
	
    int employee_id;
    double employee_salary;
    int charitableContribution;


    Employee (int id, String name, int age, char gender, double salary, double contribution, int bonus)
    {

        super(name,age,gender);

        this.employee_id = id;
        this.employee_salary = salary;
        
    }


    public void display() {
        System.out.println("id :" + this.employee_id);
        super.display();
        System.out.println("salary: " + this.employee_salary );
    }
    
    
    public double calculate(int bonus) {
        double netSalary = bonus+ this.employee_salary;
        return netSalary;
    }
    
    public double calculate(double charitableContribution, double netSalary) {
    	double contribution = netSalary * charitableContribution;
    	double newNetSalary = netSalary - contribution;
    	
    	return newNetSalary;
    }
    
    
    public void check() {
        if (this.employee_salary > 100000) {
        	System.out.println("Employee is making six figures");
        }


}
}