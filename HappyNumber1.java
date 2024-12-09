package loops;

import java.util.Scanner;

public class HappyNumber1 {
    public static int isSquareSum(int n){
        int sum=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            sum+=rem*rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        int n=scr.nextInt();
        int result=n;

        while(true){
            result=isSquareSum(result);
            System.out.println(result );
            if(result==1) {
                System.out.println("true");
                break;
            }else if(result==n) {
                System.out.println("false");
                break;
            }
        }
    }
}
