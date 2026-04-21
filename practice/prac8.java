//Fair Splits
//This program counts the number of "fair splits" in an integer array. A split at an index i is considered fair if the absolute difference between the sum of the elements before and after i is an even number.
public class prac8 {
    public static void main(String ar[]){
        int arr[]={10,10,3,7,6};
        int total=0;
        int cnt=0;
        int prefix=0;
        for(int i=0;i<arr.length;i++)
            total+=arr[i];
        for(int i=0;i<arr.length-1;i++)
        {
            prefix+=arr[i];
           int suffix=total-prefix;
           if(((Math.abs(prefix-suffix))%2)==0)
            cnt++;
        }
        System.out.println(cnt);
    }
    
}
