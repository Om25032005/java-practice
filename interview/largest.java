public class largest {
    public static int large(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        return max;

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,7,6,4,9,10,6};
        System.out.println(large(arr));

    }
    
}
