package program;
import java.util.Scanner;
public class LuckyNumber {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int luckyNumber = calculateNthLuckyNumber(n);
        System.out.println("The " + n + "th lucky number is: " + luckyNumber);
    }


    private static int calculateNthLuckyNumber(int n) {
        int count = 0;
        int num = 1;

        while (count < n) {
            
            if (isLucky(num)) {
                count++;
            }

           
            num++;
        }

       
        return num - 1;
    }

    private static boolean isLucky(int num) {
        
        String numStr = Integer.toString(num);

       
        return numStr.contains("3") || numStr.contains("4");
    }
}



