package Recursion;
import java.util.*;

public class naturalsum {
    public static int sum=0;
    public static void printSum(int n)
    {
        if(n==0)
        {
            sum=sum+n;
            System.out.println(sum);
            return;
        }
        else{
            sum=sum+n;
            printSum(n-1);
            System.out.println(n);


        }
    }
    public static void main(String args[]){
        printSum(10);
    }
}
