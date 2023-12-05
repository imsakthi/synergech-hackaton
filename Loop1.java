package forLoop;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Multiplier:");
	int n=sc.nextInt();
	System.out.println("Max:");
	int m=sc.nextInt();
	for (int i=1;i<=m;i++) {
		System.out.println(n+"*"+i+"="+n*i);
	}

	}

}
