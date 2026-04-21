//Subarray Sum Triplets
//This program counts the number of subarrays of size 3 where the sum of the first and third elements is equal to the second element.

public class prac9 {
    public static void main(String a[]){
        int arr[]={1,2,1,3,5,2,4,2};
        int cnt=0;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]+arr[i+2]==arr[i+1])
            cnt++;
        }
        System.out.print(cnt);
    }
    
}
