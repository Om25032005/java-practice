// Problem Statement  – In a theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme. The cost of the k class ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.

// Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display “Minimum of 5 and Maximum of 40 Tickets”.  If circle is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.

// The ticket cost should be printed exactly to two decimal places.

// Sample Input 1:

// Enter the no of ticket:35
// Do you want refreshment:y
// Do you have coupon code:y
// Enter the circle:k
// Sample Output 1:

// Ticket cost:4065.25
// Sample Input 2:

// Enter the no of ticket:1
// Sample Output 2:

// Minimum of 5 and Maximum of 40 Tickets
import java.util.*;
class prac3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter no of tickets");
        double n=sc.nextDouble();
        double total=0.0;
        if(n>=5  && n<=40)
        {
            System.out.println("Do you want refreshment y/n");
            String r=sc.next();
            System.out.println(" Do you have coupon code y/n");
            String c=sc.next();
            System.out.println("Enter the circle k/q");
            String cc=sc.next();
            if(cc.charAt(0)=='k' ){
                if(n>20)
                    total+=n*(75.0*90.0/100.0);
                else
                    total+=n*75.0;
                if(c.charAt(0)=='y')
                    total-=(total*2.0/100.0);
                if(r.charAt(0)=='y')
                    total+=50.0*n;
                System.out.println(total);
            }
            else if(cc.charAt(0)=='q'){
                 if(n>20)
                    total+=n*(150.0*90.0/100.0);
                else
                    total+=n*150.0;
                
                if(c.charAt(0)=='y')
                    total-=(total*2.0/100.0);
                if(r.charAt(0)=='y')
                    total+=150.0*n;
                System.out.println(total);
            }
            else 
            System.out.println("invalid Input");
        }
        else
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");



    }
}