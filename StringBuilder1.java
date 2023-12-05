package ripplesolutionprograms;
import java.util.*;

public class StringBuilder1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		StringBuilder str2=new StringBuilder();
		for(int i=1;i<str.length();i+=2)
		{
			str2.append(str.charAt(i));		
		
	}
		System.out.println(str2.toString());

}}
