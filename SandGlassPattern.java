package loops;

import java.util.Scanner;

public class SandGlassPattern {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n=scr.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
