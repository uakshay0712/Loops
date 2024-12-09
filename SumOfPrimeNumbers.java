package loops;

import java.util.Scanner;

public class SumOfPrimeNumbers {
        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scr.nextInt();
            int sum = 0;

            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }

            System.out.println(sum);
        }
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
