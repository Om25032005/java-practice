import java.util.*;
public class thirdnumber {
    public static int third(int arr[]){
        int cnt =Integer.MIN_VALUE;
        
        for(int j=0;j<2;j++){
            int max=Integer.MIN_VALUE;
            int ind=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                    ind=i;
                }
               
            }
            arr[ind]=0;
        }
        for(int i=0;i<arr.length;i++){
                if(arr[i]>cnt){
                    cnt=arr[i];
                }
               
    }
     return cnt;
}
    public static void main(String [] args){
        int arr[]={1,10,2,3,4,5,6};
        System.out.print(third(arr));
    }
    

}
