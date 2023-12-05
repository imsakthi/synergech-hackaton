package whileloop;

import java.util.Scanner;

public class WhileOffline {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the choice:");
		int ch=sc.nextInt();
		int i=1;
		while(ch*i<=100) {
			System.out.println(ch*i);
			i++;
			
			
		}

	}

}
