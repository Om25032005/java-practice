public class numberPalindrome {
    public static boolean palindrome(int n){
        int m=n;
        int r=0;
        while(m!=0){
          int rem=m%10;
          m/=10;
          r=rem+r*10;
        }
        if(r==n)
            return true;
        else
            return false;
        
    }
    public static void main(String [] args){
        int n=898;
        if(palindrome(n))
            System.out.print("palindrome");
        else
            System.out.print("Not palindrome");

    }
    
}
