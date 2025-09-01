import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseCm = sc.nextDouble();
        double heightCm = sc.nextDouble();

        double areaCm = 0.5 * baseCm * heightCm;
        double areaIn = areaCm / (2.54 * 2.54);
        
        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);

        sc.close();
    }
}
