package array;

import java.util.Scanner;

public class DiagonalElement {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
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
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					arr[i][j]=-1;
				}
				
			}
		
		}
		System.out.println("Array is 2D:");
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
					
				}
				System.out.println();
		}
	}

	}


