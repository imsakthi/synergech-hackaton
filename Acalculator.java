package classMethod;
import java.util.*;

public class Acalculator {
	  
	    	 public float calcArea(float radius) {
	    		 return 22/7*radius*radius;
	    	 }
	    	 public int SquareArea(int side){
	    		 return side * side;
	    	 }
	     

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter the radius:");
    	 int radius=sc.nextInt();
    	 System.out.print("Enter the side:");
    	 int side=sc.nextInt();
    	 Acalculator obj=new Acalculator();
    	 System.out.print("choice:");
    	 int ch=sc.nextInt();
    	 switch (ch)
    	 {
    	 case 1:
    		 float a=obj.calcArea(radius);
    		 System.out.print("CalxArea:"+a);
    		 break;
	case 2:
		 int b=obj.SquareArea(side);
		 System.out.print("CalxArea:"+b);
		 break;
	default:
        System.out.println("Invalid choice");
	}

}
}
