package array;

import java.util.Scanner;

public class Evenarray {

	public static void main(String[] args) {
		int j=0;
	
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number:");
				int a[]=new int[10];
				int b[]=new int[10];
				for(int i=0;i<a.length;i++) {
					a[i]=sc.nextInt();
				}
				for(int i=0;i<a.length;i++) {
					if(a[i]%2==0) {
						b[j]=a[i];
						j++;
					}
				
				}
				
				for(int i=0;i<b.length;i++) {
					System.out.print(b[i]);
				
			}

		}
		


	}


