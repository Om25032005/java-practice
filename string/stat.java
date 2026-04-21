import java.util.*;
public class stat {
    static int a=10;

    public static void main(String args[]){
       String s1="Omkar Raosaheb , chfjbfiewh,kwfuew +ewejfiewf$cdjwbhc@ucbdehewi";
       String arr[]=s1.split("[,+$@]");
       int max=0;
      int index=-1;
       for(int i=0;i<arr.length;i++){
        if(arr[i].length()>max){
        max=arr[i].length();
        index=i;
        }

       }
       System.err.println(arr[index]);

    }
    
}
