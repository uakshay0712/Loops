package loops;

import java.util.Scanner;

public class ConcentricSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int value = n - Math.min(Math.min(i, j), Math.min(size - i - 1, size - j - 1));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
