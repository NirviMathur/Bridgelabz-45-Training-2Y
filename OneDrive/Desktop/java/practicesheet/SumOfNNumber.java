// package practicesheet;
// sum of n numbers:

// // import java.util.Scanner;

// // public class SumOfNNumbers {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
    
// //         int n = sc.nextInt();

// //         int sum = 0;
// //         System.out.println("Enter " + n + " numbers:");
// //         for (int i = 0; i < n; i++) {
// //             int num = sc.nextInt();
// //             sum += num; 

// //         }
// //         System.out.println( n  + sum);

// //         sc.close();
// //     }
// // }


// // factorial
// import java.util.Scanner;

// public class SumOfFactorials {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number n: ");
//         int n = sc.nextInt();
//         int fact=0;
//         for (int i = 1; i <= n; i++) {
//             if(n%i==0){
//                 fact++;
//             }
//         }
//         if(fact==2){
//             System.out.println("Prime number");
//         }
//         else{
//             System.out.println("not a prime number");
//         }
//         System.out.println(fact);

//         sc.close();
//     }
// }

// while loop
// import java.util.*;
// public class SumOfNNumber {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();
//         int sum=0;
//         while(n>=0){
//             int r=n%10;
//             sum+=r;
//             n=n/10;
//         }
//         System.out.println(sum);
//     }
// }