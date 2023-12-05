package array;
import java.util.*;

public class First200Numbers {
    public static void main(String[] args) {
        int[] numbers = new int[200];
        for (int i = 0; i < 200; i++) {
            numbers[i] = i + 1;
        }

        System.out.println("The first 200 numbers are:");
        for (int i = 0; i <numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
     
    }
}
