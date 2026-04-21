public class arm {
    public static boolean armstrong(int n){
        int oldnum=n;
        String s=n+"";
        int l=s.length();
        double num=0;
        while(n!=0){
            int rem=n%10;
            n/=10;
            num=num+Math.pow(rem,l);
        }
        System.out.println(num);
        if(num==oldnum) return true;
        else
        return false;
    }
    public static void main(String[] args) {
        if(armstrong(153))System.out.println("armstrong");
        else System.out.println("not armstrong");
    }
    
}
