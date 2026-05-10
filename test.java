import java.util.*;
class test{

    boolean  prime(int n){
        if(n<2)
            return false;
        if(n==2)
            return true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
        
    }

 public static void main(String[] args) {
    test t=new test();
    for(int i=2;i<=20;i++){
        if(prime(i))
            System.out.println(i);
    }

    
                    
    }

}