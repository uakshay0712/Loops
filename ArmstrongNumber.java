package loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n= scr.nextInt();
        int rem=0;
        int sum=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;

        }
        System.out.println(sum);
        if(temp==sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");

    }
}
