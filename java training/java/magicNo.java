public class magicNo {

  
    public static void main(String args[]){
        int n=11;
       int  a=0;
        int b=0;
      int   c=1;
        for(int i=4;i<=n;i++){
            int d=a+b+c;
            a=b;
            b=c;
            c=d;



        }
        System.out.println(c);
       
        


    }
}
    

