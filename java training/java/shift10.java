//multiplier of 10 will put at end

import java.util.*;
class shift10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int arr[]=new int[n];
         int arr2[]=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i] %10 !=0){
            arr2[cnt]=arr[i];
            cnt++;}
        }
        for(int i=0;i<n;i++){
            if(arr[i] %10 ==0){
            arr2[cnt]=arr[i];
            cnt++;}
        }
            System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++\n");
           for(int i=0;i<n;i++){
           System.out.print(arr2[i]+" ");
        }


    }
}