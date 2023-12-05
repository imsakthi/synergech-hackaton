package conditionstatement;

import java.util.Scanner;

public class Switchcase {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the choice:");
		String str=sc.nextLine();
		switch (str)
		{
			case ("Apple"):
			System.out.print("This is a fruit");
			break;
			case ("Orange"):
		    System.out.print("This is a fruit");
			break;
			case ("Grape"):
			System.out.print("This is a fruit");
			break;
			case ("Potato"):
			System.out.print("This is Vegetable");
			break;
			case ("Onion"):
			System.out.print("This is a Vegetable");
			break;
			default:
			System.out.print("This is a not Vegetable");
		}
		
		
	}

}
