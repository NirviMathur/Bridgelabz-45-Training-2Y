import java.util.Scanner;

public class subjectpercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        if (percentage >=90){
            System.out.println("A+ : Excellant");
        }
        else if (percentage >= 80) {
            System.out.println("A : Good");
        } 
        else if (percentage >= 70) {
           System.out.println("B+ : Average");
        } 
        else if (percentage >= 60) {
            System.out.println("B : Below Average");
        } 
        else if (percentage >= 50) {
            System.out.println("C : Poor");
        } 
        else {
           System.out.println("F : Fail ho gye beta");
        }
    }
}
