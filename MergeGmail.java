package ripplesolutionprograms;
import java.util.*;
public class MergeGmail {
	public static String StringMerge(String name, String domain) 
	{
		return name+"@"+domain+".com";
		
	}
         public static void main(String[] args)
         {
        	 String fname ,dname;
        	 Scanner sc=new Scanner(System.in);
        	 System.out.print("name:");
        	 String str=sc.next();
        	 System.out.print("domain:");
        	 String str1=sc.next();
        	 String emailId=StringMerge(str,str1);
        	 System.out.println(emailId);
        	 
         }
}
