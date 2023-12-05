package conditionstatement;
import java.util.*;
public class NestedIf {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();
	        int largestno;
	        if (num1 > num2) {
	            if (num1 > num3) {
	                largestno = num1;
	            } else {
	                largestno = num3;
	            }
	        } else {
	            if (num2 > num3) {
	                largestno = num2;
	            } else {
	                largestno = num3;
	            }
	        }

	        System.out.println("Biggest number is: " + largestno);
	        int largestno2= (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
	        System.out.println("Biggest number is using ternary operator: " + largestno2);	        
	    }
	}



