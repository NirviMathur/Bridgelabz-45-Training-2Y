// package control_flow;

import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1<num2 && num1<num3){
            System.out.println("is"+" "+ num1+" "+"the smallest number?"+"yes");
        }
        else if(num2<num1 && num2<num3){
            System.out.println("is"+" "+num2+" "+"the smallest number?"+"yes");
        }
        else{
            System.out.println("is" +" "+num3+" "+"the smallest number?"+"yes");
        }
    }
}
