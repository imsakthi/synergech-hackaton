package ripplesolutionprograms;
import java.util.*;
public class Vowel {
	public static void main(String[] args)
	{
		  int count=0;
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the string:");
		  String str=sc.next();
		  for(int i=0;i<str.length();i++)
		  {
			  if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' )
					  count ++;
		  }
		  System.out.println(count);
	}

}
