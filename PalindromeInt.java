package loops;

import java.util.Scanner;

public class PalindromeInt {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter the Value: ");
        int n=scr.nextInt();

        int rev=0;
        int rem=0;
        int temp=n;
        while(n>0) {
            rem = n % 10;

            rev =rev* 10 + rem;
            n = n / 10;
        }
        System.out.println();
        System.out.println(rev);
        if(temp==rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
