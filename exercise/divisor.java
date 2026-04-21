package exercise;
import java.util.*;
public class divisor {
    public static int great(int a,int b)
    {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=great(a,b);
        System.out.println(ans);

    }
}
