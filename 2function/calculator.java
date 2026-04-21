import java.util.*;
public class calculator
{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int fact(int n)
    {
        int factorial=1;
        for(int i=n;i>=1;i--)
        {
            factorial=factorial*i;
        }
        return (factorial);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no for addition");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a,b);
        System.out.println(sum);
        System.out.println("enter no for factorial");
        int n=sc.nextInt();
        System.out.println(fact(n));

    }
}