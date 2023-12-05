package program;

import java.util.Scanner;

public class SimpleFindReplace {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();
        System.out.print("Enter the find string: ");
        String findString = scanner.nextLine();
        System.out.print("Enter the replace string: ");
        String replaceString = scanner.nextLine();
        String result = originalString.replace(findString, replaceString);
        System.out.println("Output: " + result);
    }
}




