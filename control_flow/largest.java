import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int num3 =sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("is"+" "+ num1+" "+"the largest number?"+"yes");
            System.out.println("Is"+" "+num2+" "+ "the largest?"+"no");
            System.out.println("Is"+" "+num3+" "+ "the largest?"+"no");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("is"+" "+ num2+" "+"the largest number?"+"yes");
            System.out.println("Is"+" "+num1+" "+ "the largest?"+"no");
            System.out.println("Is"+" "+num3+" "+ "the largest?"+"no");
        }
        else{
            System.out.println("is"+" "+ num1+" "+"the largest number?"+"yes");
            System.out.println("Is"+" "+num2+" "+ "the largest?"+"no");
            System.out.println("Is"+" "+num3+" "+ "the largest?"+"no");
        }

    }
}
