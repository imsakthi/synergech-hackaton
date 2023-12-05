package forLoop;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("ENTER THE INTEGER:");
		int n=sc.nextInt();
          for(int i=1;i<n;i++)
          {
        	  for(int j=1;j<=i;j++) {
        	  System.out.print(i+" ");
          }
		System.out.println();
	}

}
}
