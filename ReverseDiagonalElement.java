package array;

import java.util.Scanner;

public class ReverseDiagonalElement {

	public static void main(String[] args) {
	
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the array:");
				int arr[][]=new int[4][4];
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<4;j++) {
						arr[i][j]=sc.nextInt();
						
					}
			}
			    for (int i = 0; i < 4; i++) {
		            arr[i][3 - i] = -1;
		        }
				System.out.println("Array is 2D:");
					for(int i=0;i<arr.length;i++)
					{
						for(int j=0;j<4;j++) {
							System.out.print(arr[i][j]+" ");
							
						}
						System.out.println();
				}
			}

			


	}


