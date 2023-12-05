package forLoop;

import java.util.Scanner;
    public class PrimeNumber{
    	
    	    public static void main(String[] args) {
    	        System.out.println("Enter the num");
    	        Scanner sc=new Scanner(System.in);
    	       int n=sc.nextInt();
    	        
    	        for (int i = 2; i <= n; i++) {
    	            if (isPrime(i)) {
    	                System.out.print(i + " ");
    	            }
    	        }
    	    }

    	    
    	    private static boolean isPrime(int num) {
    	        if (num <= 1) {
    	            return false;
    	        }

    	        for (int i = 2; i <= Math.sqrt(num); i++) {
    	            if (num % i == 0) {
    	                return false; 
    	            }
    	        }

    	        return true; 
    	}
    }



