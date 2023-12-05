package array;

import java.util.Scanner;

public class Averagefive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		       double avg=0;
		
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the number:");
				int a[]=new int[5];
				for(int i=0;i<a.length;i++) {
					a[i]=sc.nextInt();
				}
			 double sum=0;
				for(int ch:a) {
					sum+=ch;
					
				}
				avg=sum/a.length;
				
				
					System.out.println(avg);
				
			


	}

}
