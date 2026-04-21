import java.util.*;
class test{


    public static int star(int n){
            int result=n;
            while(n!=0){
                n/=10;
                result+=n;
            }
            return result;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
         long n=sc.nextLong();
         System.out.println(n);
       
        

        
    }

}