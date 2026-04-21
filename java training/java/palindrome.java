public class palindrome {
     public static char flag='t';
      public static void palindrome(char arr[], int len){
          
            for(int i=0;i<len/2;i++){
                    if(arr[i] != arr[len-i-1]){
                        flag='f';
                        break;
                    }   
            }
            if(flag=='t')
                System.out.println("palindrome");
            else
                  System.out.println("not palindrome");
        }
    public static void main(String args[]){
        char str[]={'a','b','a','b','a'};
        palindrome(str,5); 
    }  
}
