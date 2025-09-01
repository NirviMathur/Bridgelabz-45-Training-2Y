// check if the elements of 2Darrays are even or odd. 

// import java.util.Scanner;
// public class TwoDarrays {
//     public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//        int [][] arr = new int[rows][cols];

//        for(int i=0;i<rows;i++){
//         for(int j=0;j<cols;j++){
//             arr[i][j]= sc.nextInt();
//         }
//        }
//        for(int i=0;i<rows;i++){
//         for(int j=0;j<cols;j++){
//             if(arr[i][j]%2==0){
//                 System.out.println("Even");
//             }
//             else{
//                 System.out.println("odd");
//             }
//         }
//        }
//     }
// }

// to find a given target in a 2D array and check if there is an target or not;
import java.util.*;
public class TwoDarrays{
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();
       int [][] arr = new int[rows][cols];

       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr[i][j]= sc.nextInt();
        }
       }
       int target = sc.nextInt();
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(arr[i][j]==target){
                System.out.println("target found at index:"+i+","+j);
            }
            else{
                System.out.println("target not found");
            }
        }
       }
    }
}