package loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n= scr.nextInt();

        int fact=1;
        while(n>=1){
            fact=fact*n;
            n--;
        }
        System.out.println(fact);
    }
}
