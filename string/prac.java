import java.util.*;
class pr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int cnt=0;
        while(num!=0){
            num/=10;
            cnt++;
        }
        while(num!=0){
            int n=num%10;
            if(n<=26)
            cnt++;
            num/=100;
        }
        System.out.println(cnt);
    }
}