package ripplesolutionprograms;

import java.util.*;
public class StringBuilderReverse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in) ;
		String str2;
		System.out.print("Enter the string:");
		String str=sc.next();
		StringBuilder str1=new StringBuilder(str);
		
		if(str.length()%2!=0)
		{
			str2=str1.reverse().toString();
			System.out.println(str2);
		}
		else
		{
			System.out.println(str);
		}
		
	}

}
