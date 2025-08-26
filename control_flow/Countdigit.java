import java.util.Scanner;

public class Countdigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int temp = Math.abs(number);
        int count = 0;
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp /= 10; 
                count++;
            }
        }

        System.out.println("The number of digits in " + number + " is: " + count);

        sc.close();
    }
}
