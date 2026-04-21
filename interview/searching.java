public class searching {

    public static void linear(int [] arr,int key){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                index=i;
                break;
            }
        }
        if(index==-1)System.out.println("not found");
        else System.out.println("found at index "+index);
    }

     public static void sentinal(int [] arr,int key){
        int last=arr[arr.length-1];
        arr[arr.length-1]=key;
        int i=0;
        while(arr[i]!=key)
            i++;
        if(i<arr.length-1 || key==last)System.out.println("found at index "+i);
        else System.out.println("not found");
    }

    public static void binary(int [] arr,int key){
       
        int left=0;
        int index=-1;
        int right=arr.length-1;
        int mid=arr.length/2;
        while(left<=right && index==-1){
            mid=(left+right)/2;
            if(arr[mid]==key){
                index=mid;
                break;
            }
            else if(arr[mid]>key)
                right=mid-1;
            else
                left=mid+1;

        }
        if(index==-1)System.out.println("not found");
        else System.out.println("found at index "+index);

    }
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int key=100;
        //linear(arr,key);
        //binary(arr,key);
        sentinal(arr,key);
         

    }
    
}
