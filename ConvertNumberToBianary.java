package loops;

import java.util.Scanner;

public class ConvertNumberToBianary {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter Decimal: ");
        int n = scr.nextInt();
//        String s=Integer.toBinaryString(n);
//        System.out.println(s);
        //   }

        String binary = "";
        int number = n;
        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }
        if (binary.isEmpty()) {
            binary = "0";
        }

        System.out.println(binary);
    }
}
