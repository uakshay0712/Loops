package loops;

import java.util.Scanner;

public class BinaryPattern {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();
        int m= scr.nextInt();

        for(int i=0;i<n;i++) {
            for (int j = 0; j<m; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}
