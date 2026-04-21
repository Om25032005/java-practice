public class prac16 {
    // static class pair{
    //     int n1=0;
    //     int n2=0;
    //     int prod=0;
    //     pair(int n1,int n2,int prod){
    //         this.n1=n1;
    //         this.n2=n2;
    //         this.product=product;
    //     }
    // }

    
    public static void main(String args[]){
        
    int m1=0;
    int m2=0;
    int mul=0;
        int arr[]={11,1,2,8,10,11,15,7};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]+arr[j]==18)
                {
                    int mult=arr[i]*arr[j];
                    if(mult>mul){
                        m1=arr[i];
                        m2=arr[j];
                        mul=mult;
                    }


                }
                
            }
        }
        int arr1[]=new int[2];
        if(m1>m2){
             arr1[0]=m1;
             arr1[1]=m2;
        }
        else{
             arr1[0]=m2;
             arr1[1]=m1;

        }
        System.out.print(arr1[0]+" "+arr1[1]);
       
        
    }
    
}
