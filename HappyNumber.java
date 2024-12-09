package loops;



import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n= scr.nextInt();

                if (isHappy(n)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            }
            public static boolean isHappy(int n) {
                HashSet<Integer> hs = new HashSet<>();

                while (n != 1 && !hs.contains(n)) {
                    hs.add(n);
                    n = sumOfDigits(n);
                }

                return n == 1;
            }
            public static int sumOfDigits(int n) {
                int sum = 0;
                while (n > 0) {
                    int digit = n % 10;
                    sum += digit * digit;
                    n /= 10;
                }
                return sum;

    }
}
