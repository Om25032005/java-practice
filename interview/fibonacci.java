public class fibonacci {
    // Iterative Fibonacci (returns nth term correctly)
    public static int IterativeFibonacci(int n) {
        int a1 = 0;
        int a2 = 1;

        if (n == 0) return a1;  // 0th term
        if (n == 1) return a2;  // 1st term

        for (int i = 2; i < n; i++) {
            int c = a1 + a2;
            a1 = a2;
            a2 = c;
        }
        return a2;  // nth term
    }
    // Recursive Fibonacci (returns nth term correctly)
    public static int recFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return recFibonacci(n - 1) + recFibonacci(n - 2);
    }

    
    static int a=0;
    static int b=1;
    static int n1=0;
    

    public static int fib(int n){
        
        if(n==1)
            return 1;
        int c=a+b;
        if(n1==0){
             System.out.println(a);
             System.out.println(b);
        }
        n1=n;
       
        System.out.println(c);
        a=b;
        b=c;
        return fib(n-1);

    }

    public static void main(String[] args) {
        int n=8;
        System.out.println("Iterative (n=8): " + IterativeFibonacci(n));
        System.out.println("Recursive (n=8): " + recFibonacci(n-1));
        fib(n-1);
    }
}
