public class magic {

   
    public static void main(String args[]){
        int n=15;
        
        if(n>=0 && n<10)
        {
            System.out.println(n);
            return;
        }
        while(n>9){
            int cnt=0;
            while(n!=0){
                cnt+=n%10;
                n/=10;
            }
            n=cnt;
           
        }
        System.out.println(n);
       


            
          
            

      
    }
    
}
