import java.util.*;
public class mintq {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int prev=0;
        System.out.println("enter no of kids");
        int k=sc.nextInt();
        System.out.println("enter no of mint");
        int m=sc.nextInt();
        int sum=m;
        for(int i=1;i<k;i++)
        {
            prev=sum-1;
            sum=sum+prev;
        }
        System.out.println(sum);

    

    }
    
}
