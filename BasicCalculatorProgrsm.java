package classMethod;
import java.util.*;



public class BasicCalculatorProgrsm {
    
     static class BasicCalculator {
        private int i, j;

        public BasicCalculator(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int add() {
            return i + j;
        }

        public long sub() {
            return i - j;
        }

        public float mul() {
            return i * j;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Integer: ");
        int i = sc.nextInt();
        System.out.print("Enter the second Integer: ");
        int j = sc.nextInt();
        BasicCalculator calc = new BasicCalculator(i, j);
        System.out.print("Result of addition: " + calc.add());
        System.out.print("Result of subtraction: " + calc.sub());
        System.out.print("Result of multiplication: " + calc.mul());
        sc.close();
    }
}



