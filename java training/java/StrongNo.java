import java.util.*;
public class StrongNo{
    public static int fact(int num){
        if(num==1)
            return 1;
        else
            return num*fact(num-1);
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no");
    int no=sc.nextInt();
    int n=no;
    int fn=0;
    
    while(n!=0)
    {
        int f=n%10;
        n=n/10;
        
         fn+=fact(f);
    }
       
    if(fn==no)
        System.out.println("Strong");
    else
        System.out.println("Not Strong");
    sc.close();
    }

}
