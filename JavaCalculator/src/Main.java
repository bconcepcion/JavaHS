
import java.util.Scanner;
public class Main {
	
	
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void subtract(int a, int b) {
		System.out.println(a-b);
	}
	
	public static void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public static void divide(int a, int b) {
		System.out.println(a/b);
	}
	

	
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Enter two numbers between 1-5");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("Enter + to add");
		System.out.println("Enter - to subtract");
		System.out.println("Enter * to multiply");
		System.out.println("Enter / to divide");
		System.out.println("Enter x to exit");
		
		System.out.println();
		
		char operator = input.next().charAt(0);
		
		switch(operator) {
		default:
			System.out.println("Enter two numbers between 1-5");
		
		case '+':
			add(num1,num2);
		break;
		
		case '-':
			subtract(num1,num2);
		break;
		case '*':
			multiply(num1,num2);
		break;
		case '/':
			divide(num1,num2);
		break;
		case 'x':
			input.close();
			System.exit(0);
		
		}
		
	}
	
	
	
}

