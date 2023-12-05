package conditionstatement;
import java.util.*;
public class IfelseLogical {
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the Marks:");
    	int n1=sc.nextInt();
    	System.out.print("Enter the age:");
    	int n2=sc.nextInt();
    	if(n1>70 && n2>20)
    	{
    		System.out.println("You are eligible for scholarship");
    	}
    	else {
    		System.out.println("You are not eligible for scholarship");
    	}
    }

}
