package program;

import java.util.Scanner;

public class Programfirst {
	
	static boolean findLicenseEligibility(int age,String ch) {
		if((age> 18 && age < 60) && (ch.equals("TN")||ch.equals("KA") ||ch.equals("KL"))) {
			return true;
		}
		else if((age> 60 &&  age < 18 ) && (ch.equals("TN")||ch.equals("KA") ||ch.equals("KL"))) {
			return false;
		}
		else if(age>15){
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age:");
		int age=sc.nextInt();
		System.out.print("Enter the state code:");
		String ch=sc.nextLine();
		
		boolean isEligible = findLicenseEligibility(age, ch);

        if (isEligible) {
            System.out.println("You are eligible for a license.");
        } else {
            System.out.println("You are not eligible for a license.");
        }
    }

		
		
		
		
		

	}

