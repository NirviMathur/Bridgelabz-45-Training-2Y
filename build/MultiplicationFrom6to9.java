package arrays;
import java.util.Scanner;

public class MultiplicationFrom6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number to generate multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        // Array to store results (4 results for 6,7,8,9)
        int[] multiplicationResult = new int[4];

        // Store multiplication results
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display results
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        sc.close();
    }
}
