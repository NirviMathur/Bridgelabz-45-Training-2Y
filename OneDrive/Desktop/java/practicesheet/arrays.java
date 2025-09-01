// import java.util.*;

// // public class arrays {
//     public static void main(String[] args) {
//         int[]marks = new int[100];
//         marks[0] = 98;
//         marks[1] = 67;
//         marks[2] = 77;
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
//         for(int i=0;i<3;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         // input
//         for(int i=0;i<size;i++){
//             numbers[i]= sc.nextInt();
//         }
//         // output
//         for (int i =0;i<size;i++){
//             System.out.println(numbers[i]);
//         }
//     }
// }

// __________________________________
// to search the given number x and print at index at which it occurs:[linear search]

// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         for(int i=0;i<size;i++){
//             numbers[i]= sc.nextInt();
//         }
//         int x= sc.nextInt();




//         for (int i =0;i<numbers.length;i++){
//             if(numbers[i] == x){
//                 System.out.println("x is found at index:" + i);
//             }
//         }
//     }
// }