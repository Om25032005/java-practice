public class swap {
    public static void swap1(int arr[], int key)
    {

          int n=arr.length;

            for(int i=0;i<key;i++){
                int temp=arr[i];
                arr[i]=arr[n-key+i];
                arr[n-key+i]=temp;  
            }
      
       
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    
    
    public static void main (String[] ar){
        int [] arr={1,2,3,4,5,6,7};
        int key=3;
        swap1(arr,key);
      
}
}
