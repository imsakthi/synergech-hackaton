package ripplesolutionprograms;
import java.util.*;
public class StringAPI {
 public static void main(String args[]) {
	 
	 String str="India Cricket Board";
	 String str2="India";
	 String str3="INDIA";
	 System.out.println(str2.compareTo(str3));
	 System.out.println(str2.equals(str3));
	 System.out.println(str.length());
	 String str4="Hello";
	 System.out.println(str4.replace('e','a'));
	 String[] str24=str.split(" ");
	 System.out.println(str24[1]);
	 String str5=str.substring(6,13);
	 System.out.println(str5);
	 
	 
	 
	 
 }
}
