import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            int counter = 1;
            System.out.print("Multiples of " + number + " below 100 are: ");

            while (number * counter < 100) {
                System.out.print((number * counter) + " ");
                counter++;
            }

            System.out.println();
        }

        sc.close();
    }
}
