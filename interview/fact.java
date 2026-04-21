public class fact {
    public static int  facto(int n){
        if(n==1)
            return 1;
        return n*facto(n-1);

    }

    public static int Iterativefactorial(int n){
        int m=n;
        for(int i=1;i<n;i++){
            m=m*i;
        }
        return m;
    }
    public static void main(String args[]){
        System.out.println(facto(6));
         System.out.print(Iterativefactorial(6));
    }
    
}
