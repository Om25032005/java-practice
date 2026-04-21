class fib{
    public static int fib(int n){
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int next=a+b;
            b=a;
            a=next;
        }
        return a;
    }
    public static void main(String[] args) {
     System.out.println(fib(8));
        
    }
}