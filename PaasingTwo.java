package classMethod;
import java.util.*;

public class PaasingTwo {
	
        static class BasicCalculator {

	        public int add(int num1, int num2) {
	            return num1 + num2;
	        }

	        public long subtract(int num1, int num2) {
	            return num1 - num2;
	        }

	        public float multiply(int num1, int num2) {
	            return num1 * num2;
	        }
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        BasicCalculator calc = new BasicCalculator();
	        System.out.println("Choose an operation:");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();
	        System.out.print("Enter the first: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter the second: ");
	        int num2 = sc.nextInt();
	        switch (choice) {
	            case 1:
	                int sum = calc.add(num1, num2);
	                System.out.println("Result of addition: " + sum);
	                break;
	            case 2:
	                long difference = calc.subtract(num1, num2);
	                System.out.println("Result of subtraction: " + difference);
	                break;
	            case 3:
	                float product = calc.multiply(num1, num2);
	                System.out.println("Result of multiplication: " + product);
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }

	        
	    }
	}


