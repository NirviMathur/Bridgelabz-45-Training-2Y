import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Amarage = sc.nextInt();
        int Akbarage = sc.nextInt();
        int Anthonyage = sc.nextInt();
        double Amarheight = sc.nextDouble();
        double Akbarheight = sc.nextDouble();
        double Anthonyheight = sc.nextDouble();

        int youngestAge = Amarage;
        String youngestFriend = "Amar";

        if (Akbarage < youngestAge) {
            youngestAge = Akbarage;
            youngestFriend = "Akbar";
        }
        if (Anthonyage < youngestAge) {
            youngestAge = Anthonyage;
            youngestFriend = "Anthony";
        }
        double tallestHeight = Amarheight;
        String tallestFriend = "Amar";

        if (Akbarheight > tallestHeight) {
            tallestHeight = Akbarheight;
            tallestFriend = "Akbar";
        }
        if (Anthonyheight > tallestHeight) {
            tallestHeight = Anthonyheight;
            tallestFriend = "Anthony";
        }

        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm");

        sc.close();
    }
}
