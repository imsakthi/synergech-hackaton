package ripplesolutionprograms;
import java.util.*;
public class StringParsing {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the string:");
	String str=sc.next();
	char[] ch=str.toCharArray();
	for(char ch1:ch)
	{
		System.out.print(ch1+" ");
	}
}
}
