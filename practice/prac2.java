// Problem Statement – Ritik wants a magic board, which displays a character for a corresponding number for his science project. Help him to develop such an application.
// For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
// [Assume the number of inputs should be always 4 ]

// Sample Input 1:

// Enter the digits:
// 65
// 66
// 67
// 68
// Sample Output 1:

// 65-A
// 66-B
// 67-C
// 68-D

// Sample Input 2:

// Enter the digits:
// 115
// 116
// 101
// 112
// Sample Output 2:

// 115-s
// 116-t
// 101-e
// 112-p
import java.util.*;
class prac2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter ");
        int v1=sc.nextInt();
        int v2=sc.nextInt();
         int v3=sc.nextInt();
          int v4=sc.nextInt();


          char y1= (char) v1;
          char y2= (char) v2;
          char y3= (char) v3;
          char y4= (char) v4;

          System.out.println(v1+"-"+y1+"\n"+v2+"-"+y2+"\n"+v3+"-"+y3+"\n"+v4+"-"+y4+"\n");


        

    }

}
