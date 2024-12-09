package loops;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s= scr.nextLine();
        String rev="";

        for(int i=s.length()-1;i>=0;i--){
            rev= rev+s.charAt(i);
        }
        System.out.println(rev);
        if(s.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        }
}
