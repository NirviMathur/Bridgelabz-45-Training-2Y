import java.util.Scanner;

public class bmi {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        float height = sc.nextFloat();
        float bmi = weight/(height*height);
        if(bmi<18.5){
            System.out.println("the person is underweight");
        }
        else if(bmi>=18.5 && bmi<24.9){
            System.out.println("the person is fit");
        }
        else if(bmi>=25 && bmi<29.9){
            System.out.println("the person is overweight");
        }
        else{
            System.out.println("the person is obese");
        }
    }
}
