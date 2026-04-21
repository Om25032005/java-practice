public class one {
    public static void main(String args[]){
        String s="ABBCDE";
        int digit=0;
        int arr[]={10,20,8685,23432,324,4322,432,40};
        for(int i=0;i<arr.length;i++){
            int rem=arr[i]%10;
            digit=digit*10+rem;

        }
        if(digit%10==0)
        System.out.println("divisible by 10");
        else
        System.out.println("not");
      
    }

    
}
