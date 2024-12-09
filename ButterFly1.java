package loops;

import java.util.Scanner;

public class ButterFly1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int i, j, k = 1;
        for (i = 1; i <= 2 * n - 1; i++) {
            for (j = 1; j <= 2 * n - 1; j++) {
                if (j <= k || j >= 2 * n - k) {
                    System.out.print("*");
                } else
                    System.out.print(" ");

            }
            System.out.println();
            if (i < n)
                k++;
            else
                k--;
        }


    }
}
