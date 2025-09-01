import java.util.Scanner;

public class feediscountuserinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for fee and discount percent
        System.out.print("Enter the Student Fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter the University Discount Percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount and final fee
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Print output
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
