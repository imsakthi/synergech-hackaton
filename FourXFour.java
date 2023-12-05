package array;

import java.util.Scanner;

public class FourXFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array:");
		int arr[][]=new int[4][4];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			max=arr[i][0];
			for(int j=1;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
			
		}
			}
			
				System.out.println( "The largest number in row"+(i+1)+"is:"+max);
	

	}

}
}
