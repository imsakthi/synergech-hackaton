package ripplesolutionprograms;

import java.util.*;

public class JavaApi {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();
		String uppercase=str.toUpperCase();
		System.out.println(uppercase);
		System.out.println(str.length());
		System.out.println(str.substring(2, 4));
		System.out.println(str.charAt(0));
	}

}
