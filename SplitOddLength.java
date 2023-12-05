package ripplesolutionprograms;
import java.util.*;
public class SplitOddLength {
 public static void main(String args[])
		 {
	         Scanner sc=new Scanner(System.in);
	         System.out.print("Enter the string:");
	         String str=sc.nextLine();
	         String[] str2=str.split(" ");
	         for(int i =0;i<str2.length;i++)
	         {
	        	 if(str2[i].length()%2!=0) {
	        		 System.out.print(str2[i]+" ");
	        	 }
	        	 else
	        	 {
	        		 
	        	 }
	        		 
	         }
	         
	 
		 }
}
