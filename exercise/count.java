package exercise;
import java.util.*;

public class count {
    public static String numbers(int a)
    {
        if(a>0)
            return "p";
        else if(a<0)
            return "n"; 
        else 
            return "z";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch=1;
        int num;
        int p=0,z=0,n=0;
        while(ch==1){
            System.out.println("enter no");
            num=sc.nextInt();
            String s=numbers(num);
        if(s=="p")
            p=p+1;
        else if(s=="n")
            n=n+1; 
        else 
            z=z+1;
            System.out.println("do you want to get numbers :");
            ch=sc.nextInt();
        }
        System.out.println("positive :"+p );
        System.out.println(" negative :"+n);
        System.out.println(" zeros :"+z);
    }

}
