package whileloop;

import java.util.Scanner;

public class WhileFirst {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			if(i%10==0) {
				System.out.print(i+" ");
				
			}
			i++;
		}
		
	}

}
