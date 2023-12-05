package forLoop;

public class SumEven {

	    public static void main(String args[]) {
	        int N = 100;
	  
	   System.out.println("Numbers with even sum of digits:");

	   
	   for (int i = 1; i <= N; i++) {
	            int number = i;
	            int sum = 0;

	            while (number != 0) {
	                sum += number % 10;
	               
	                number=number/10;

	            if (sum % 2 == 0) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}
}
