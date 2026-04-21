import java.util.*;







//Hollow rectangle
// class pattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter height and width: ");
//         int h=sc.nextInt();
//         int w=sc.nextInt();
//         for (int i=1;i<=h;i++)
//         {
//             for(int j=1;j<=w;j++)
//             {
//                 if(i==1 || i==h || j==1 || j==w )
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }

// }
//output--
// enter height and width: 5
// 9
// *********
// *       *
// *       *
// *       *
// *********
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


//half pyramid
// class pattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter dimension: ");
//         int d=sc.nextInt();
//         for (int i=1;i<=d;i++)
//         {
//             for(int j=1;j<=i;j++)
//                     System.out.print("*");
//             System.out.println();
//         }
//     }
// }

// output--
// enter dimension: 5
// *
// **
// ***
// ****
// *****

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Inverted Half Pyramid
// class pattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter dimension: ");
//         int d=sc.nextInt();
//         for (int i=d;i>=1;i--)
//         {
//             for(int j=1;j<=i;j++)
//                     System.out.print("*");
//             System.out.println();
//         }
//     }
// }

// output--
// enter dimension: 5
// *****
// ****
// ***
// **
// *
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Inverted Half Pyramid rotated by 180 degree
// class pattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter dimension: ");
//         int d=sc.nextInt();
//         for (int i=1;i<=d;i++)
//         {
//             for(int j=1;j<=d-i;j++)
//                     System.out.print(" ");
//             for(int k=1;k<=i;k++)
//                     System.out.print("*");
            
//             System.out.println();
//         }
//     }
// }

// output-
// enter dimension: 6
//      *
//     **
//    ***
//   ****
//  *****
// ******

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//half pyramid with numbers
// class pattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter dimension: ");
//         int d=sc.nextInt();
//         for (int i=1;i<=d;i++)
//         {
//             for(int j=1;j<i;j++)
//                     System.out.print(j);
//             System.out.println();
//         }
//     }
// }

// output--

// enter dimension: 5

// 1
// 12
// 123
// 1234

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



//inverted half pyramid with numbers
// class pattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter dimension: ");
//         int d=sc.nextInt();
//         for (int i=d;i>=1;i--)
//         {
//             for(int j=1;j<=i;j++)
//                     System.out.print(j);
//             System.out.println();
//         }
//     }
// }


// output--
// enter dimension: 5
// 12345
// 1234
// 123
// 12
// 1


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



//floyds triangle
// class pattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter dimension: ");
//         int n=1;
//         int d=sc.nextInt();
//         for (int i=1;i<=d;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                     System.out.print(n+" ");
//                     n=n+1;
//             }

//             System.out.println();
//         }
//     }
// }

// output--

// enter dimension: 4
// 1
// 2 3
// 4 5 6
// 7 8 9 10

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


//0-1 triangle
// class pattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter dimension: ");
//         int d=sc.nextInt();
//         for (int i=1;i<=d;i++)
//         {
//             if(i%2==0)
//             {
//                 for(int j=1;j<=i;j++)
//                 {
//                     if(j%2==0)
//                         System.out.print("1");
//                     else
//                         System.out.print("0");
//                 }
//             }
//             else
//             {
//                 for(int j=1;j<=i;j++)
//                 {
//                     if(j%2==0)
//                         System.out.print("0");
//                     else
//                         System.out.print("1");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }


//OR

// class pattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter dimension: ");
//         int d=sc.nextInt();
//         for (int i=1;i<=d;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 if((i+j)%2==0)
//                     System.out.print("1");
//                 else
//                     System.out.print("0");    
//             }

//             System.out.println();
//         }
//     }
// }


// output--
// enter dimension: 5
// 1
// 01
// 101
// 0101
// 10101

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Butterfly pattern
// class pattern{
//         public static void main(String args[]){
//             Scanner sc=new Scanner(System.in);
//             System.out.print("enter dimension no: ");
//             int d=sc.nextInt();
//             for(int i=1; i<=d; i++) {
//                 for(int j=1; j<=i; j++) 
//                     System.out.print("*");
//                 int spaces = 2 * (d-i);
//                 for(int j=1; j<=spaces; j++) 
//                     System.out.print(" ");
//                 for(int j=1; j<=i; j++)
//                     System.out.print("*");
//                 System.out.println();
//             }
//             for(int i=d; i>=1; i--) {
//                 for(int j=1; j<=i; j++) 
//                     System.out.print("*");
//                 int spaces = 2 * (d-i);
//                 for(int j=1; j<=spaces; j++) 
//                     System.out.print(" ");
//                 for(int j=1; j<=i; j++)
//                     System.out.print("*");
//                 System.out.println();
//             }
//         }
//     }
// output--
// enter dimension no: 4
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


//solid rhombus
// class pattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter dimension :");
//         int d=sc.nextInt();
//         for(int i=d;i>=1;i--)
//         {
//             for(int j=1;j<=i;j++)
//                 System.out.print(" ");
//             for(int j=0;j<=d;j++)
//                 System.out.print("*");
//             System.out.println(); 
//         }
//     }
// }

// output--

// enter dimension :5
//      ******
//     ******
//    ******
//   ******
//  ******

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//number pyramid
// class pattern{
//         public static void main(String args[]){
//             Scanner sc=new Scanner(System.in);
//             System.out.print("enter odd dimension :");
//             int d=sc.nextInt();
//             for(int i=1;i<=d;i++)
//             {
//                 for(int j=1;j<=d-i;j++)
//                     System.out.print(" ");
//                 for(int j=1;j<=i;j++)
//                 {
//                     System.out.print(i);
//                     System.out.print(" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }

//     output--

//     enter odd dimension :5
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5


// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//palindromic pattern
// class pattern{
//         public static void main(String args[]){
//             Scanner sc=new Scanner(System.in);
//             System.out.print("enter odd dimension :");
//             int d=sc.nextInt();
//             for(int i=1;i<=d;i++)
//             {
//                 for(int j=1;j<=d-i;j++)
//                     System.out.print(" ");
//                 for(int j=i;j>=1;j--)
//                     System.out.print(j);
//                 for(int j=2;j<=i;j++)
//                     System.out.print(j);
//                 System.out.println();                


//             }
//         }
//     }

//     output--

//     enter odd dimension :5
//     1
//    212
//   32123
//  4321234
// 543212345

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//diamond shape
// class pattern{
//         public static void main(String args[]){
//             Scanner sc=new Scanner(System.in);
//             System.out.print("enter odd dimension :");
//             int d=sc.nextInt();
//             for(int i=1;i<=d;i++)
//             {
//                 for(int j=1;j<=d-i;j++)
//                     System.out.print(" ");
//                 for(int j=1;j<=(2*i-1);j++)
//                     System.out.print("*");
//                 System.out.println();
//             }
//             for(int i=d-1;i>=1;i--)
//             {
//                 for(int j=1;j<=d-i;j++)
//                     System.out.print(" ");
//                 for(int j=1;j<=(2*i-1);j++)
//                     System.out.print("*");
//                 System.out.println();
//             }
//         }
//     }


//     output--
    
    
//     enter odd dimension :7
//       *
//      ***
//     *****
//    *******
//   *********
//  ***********
// *************
//  ***********
//   *********
//    *******
//     *****
//      ***
//       *


//       +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



//hollow butterfly
// class pattern{
//         public static void main(String args[]){
//             Scanner sc=new Scanner(System.in);
//             System.out.print("enter odd dimension :");
//             int d=sc.nextInt();
//             for(int i=1;i<=d;i++)
//             {
//                 for(int j=1;j<=i;j++)
//                 {
//                     if(j==1 || j==i)
//                         System.out.print("*");
//                     else
//                         System.out.print(" ");
//                 }
//                 for(int j=1;j<=2*(d-i);j++)
//                     System.out.print(" ");
//                 for(int j=1;j<=i;j++)
//                 {
//                     if(j==1 || j==i)
//                         System.out.print("*");
//                     else
//                         System.out.print(" ");
//                 }
//                 System.out.println();
                
//             }
//             for(int i=d;i>=1;i--)
//             {
//                 for(int j=1;j<=i;j++)
//                     {
//                         if(j==1 || j==i)
//                             System.out.print("*");
//                         else
//                             System.out.print(" ");
//                     }
//                 for(int j=1;j<=2*(d-i);j++)
//                     System.out.print(" ");
//                 for(int j=1;j<=i;j++)
//                     {
//                         if(j==1 || j==i)
//                             System.out.print("*");
//                         else
//                             System.out.print(" ");
//                     }
//                 System.out.println();
                
//             }
//         }
//     }

// output--

// enter odd dimension :5
// *        *
// **      **
// * *    * *
// *  *  *  *
// *   **   *
// *   **   *
// *  *  *  *
// * *    * *
// **      **
// *        *

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//Pascal’s Triangle.

// class pattern{
//         public static void main(String args[]){
//             Scanner sc=new Scanner(System.in);
//             System.out.print("enter odd dimension :");
//             int d=sc.nextInt();
//             for(int i=1;i<=d;i++)
//             {
//                 for(int j=1;j<=d-i;j++)
//                     System.out.print(" ");
//                 int value=1;
//                 for (int j = 1; j <= i; j++)
//                 { 
//                     System.out.print(value + " ");
//                     value = value * (i - j) / j; 
//                 }
//                 System.out.println();
                
//             }
//         }
//     }


// output--
// enter odd dimension :5
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



