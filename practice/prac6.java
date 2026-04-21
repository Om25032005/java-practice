import java.util.*;
public class prac6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int num1=sc.nextInt();
        int num=num1;
        int rev=0;
        if(num<0)
            System.out.println("Invalid input");
        while(num!=0)
        {
            int n=num%10;
            num=num/10;
            rev=rev*10+n;
        }
        if(num1==rev)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");




    }
    
}
