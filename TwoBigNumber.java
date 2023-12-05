package conditionstatement;
import java.util.*;

public class TwoBigNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the first no:");
    	int n1=sc.nextInt();
    	System.out.print("Enter the second no:");
    	int n2=sc.nextInt();
    	if(n1>n2)
    	{
    		System.out.println(n1+" is the biggest no.");
    	}
    	else
    	{
    		System.out.println(n2+" is the biggest no.");
    	}
    	
    	
	}
}
