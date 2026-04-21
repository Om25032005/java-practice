import java.util.*;
class travel{
    public static void main(String [] args){
        System.out.println("enter rate for first n hrs");
        Scanner sc=new Scanner(System.in);
        double r1=sc.nextDouble();
        System.out.println("enter first n hrs");
        double n=sc.nextDouble();
        System.out.println("enter rate for later hrs");
        Double r2=sc.nextDouble();
        System.out.println("enter minuits");
        int min=sc.nextInt();
        double total_cost=0;

        Double total_hrs=min/60.0;
        int totalhr=0;
        int total_hrs1=min/60;
        if(total_hrs>total_hrs1)
            totalhr=total_hrs1+1;
        else
            totalhr=total_hrs1;

        if(totalhr>n)
            total_cost=r1*n;
        else  {  
            total_cost=totalhr*r1;
            System.out.println(total_cost);
            return;
        }

        total_cost+=r2*(totalhr-n);
        System.out.println(total_cost);



    }
}