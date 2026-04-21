public class nail {
    public static void main(String[] args) {
        int arr[]={2,2,5,1,1};
        int n=5;
        int x=4;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=x)
            cnt++;
            else{
                while(arr[i] !=0){
                    arr[i]/=x;
                    cnt++;
                }

            }

        }
        if(cnt<max)
        System.out.println(cnt);
        else
        System.out.println(max);
    }
    
}
