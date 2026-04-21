import java.util.*;
class wall{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double total_cost=0;
        System.out.println("enter no of interior walls");
        int int_wall=sc.nextInt();
        System.out.println("enter surface areas");
        for(int i=0;i<int_wall;i++){
            double temp=sc.nextInt();
            total_cost+=temp*18;
        }

        System.out.println("enter no of interior walls");
        int ext_wall=sc.nextInt();
        System.out.println("enter surface areas");
        for(int i=0;i<ext_wall;i++){
            double temp=sc.nextInt();
            total_cost+=temp*12;
        }

        System.out.println("total cost: "+total_cost);
        sc.close();
}
    }
    