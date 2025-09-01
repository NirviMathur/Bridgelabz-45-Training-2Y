import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String operation = sc.next();

        double result;
        switch (operation) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }

        sc.close();
    }
}
