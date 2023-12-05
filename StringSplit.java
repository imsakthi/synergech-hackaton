package ripplesolutionprograms;
import java.util.*;
public class StringSplit {
	
	 public static void main(String[] args)
	 {
		 String str="i like to read newspaper";
		 String[] str1=str.split(" ");
		 for(String str2 : str1)
		 System.out.print(str2.substring(0,1).toUpperCase()+str2.substring(1,str2.length())+ " ");
		 
		 
	 }
}

