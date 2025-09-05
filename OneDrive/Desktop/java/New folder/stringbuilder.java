import java.util.*;
public class stringbuilder{
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("tony");
//     //     // System.out.println(sb);

//     //     // char st index 0
//     //     System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0, 'p');
        System.out.println(sb);

//     //     // insert
//     //     sb.insert(2, 's');
//     //     System.out.println(sb);

//     //     // delete

//     //     sb.delete(2, 3);
//     //     System.out.println(sb);
//     //     // 2
//     //     sb.delete(2, 4);
//     //     System.out.println(sb);

//     // }


//     // _______________________________

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("h");
//         sb.append("e");    //str = str+"e"
//         sb.append("l");
//         sb.append("l");
//         sb.append("o");
//         System.out.println(sb);

//         System.out.println(sb.length());
    
// }
// }

// QUES - reverse string 
// import java.util.*;
// public class stringbulder{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("hello");
//         for(int i=0;i<sb.length()/2;i++){
//             int front =i;
//             int back = sb.length()-1-i;
//             char frontchar =sb.charAt(front);
//             char backchar = sb.charAt(back);
//             sb.setCharAt(front, backchar);
//             sb.setCharAt(back, frontchar);
//         }
//         System.out.println(sb);


    }
}