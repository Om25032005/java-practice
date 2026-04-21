public class prime {
    public static boolean isPrime(int n){
        if(n%2==0)
            return false;
        for(int i=3;i<Math.sqrt(n);i+=2){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        if(isPrime(100))
            System.out.print("prime");
        else
            System.out.print("not prime");
    }
}
