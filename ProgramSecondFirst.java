package program;

import java.util.Scanner;

public class ProgramSecondFirst {
	
	              static double findAverage(int arr[]) {
	            	  int sum=0;
	            	  for(int ch:arr) {
	            		  sum=sum+ch;
	            	  }
	            	  double avg=sum/arr.length;
					return avg;
	            	  
	              }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the integer:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		double avg=findAverage(arr);
		System.out.println("AVG:"+avg);

	}

}
