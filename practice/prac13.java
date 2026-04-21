public class prac13 {
    public static void main(String args[]){
        int n=5;
        int arr[]={10,15,12,9,14};
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
            arr1[i]=0;

        if(arr[0]<arr[1]) 
            arr1[0]++;
        if(arr[0]<arr[n-1])
            arr1[0]++;
        if(arr[n-1]<arr[0]) 
            arr1[n-1]++;
        if(arr[n-1]<arr[n-2])
            arr[n-1]++;
        for(int i=1;i<n-1;i++ )
        {
            if(arr[i]<arr[i-1])
                arr1[i]++;
            if(arr[i]<arr[i+1])
                arr1[i]++;
        }
        for(int i=0;i<n;i++)
            System.out.println(arr1[i]);
    }
    
}
