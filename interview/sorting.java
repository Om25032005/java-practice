public class sorting {



     public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;    
                }
            }
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }






    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j])
                    min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while( j>=0 && key<arr[j] ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

    }

    public static void main(String[] args) {
        int arr[]={1,5,6,3,4,9,4,6,3,10};
        // bubble(arr);
        // selection(arr);
        insertion(arr);
    }
    
}
