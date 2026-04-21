package exercise;
import java.util.*;
public class power {

    public static int cal(int x,int n)
    {
        int m=x;
          for(int i=1;i<n;i++)
           {
                m=x*m;
           }
                
            return m;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no x and n");
        int x=sc.nextInt();
        int n=sc.nextInt();
        int ans=cal(x,n);
        System.out.println(ans);
    }
    
}
