import java.util.*;
public class tree {
    public static void main(String[] args) {
        
    

    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int n=10;
    int k=8;
    
    int index=0;
    for(int i=0;i<n;i++){
        if(arr[i]==k){
            index=i;
            break;
        }
    }
    int m=0;
    int c=0;
    int l=0;
  int u=0;

 c=1;
 int c1=0;
 int c2=0;

  while(c<=n){
      c1=c;
      c2=c+c;
  
   if(index<c2 && index >c1){
    break;
   }
   else{
    c+=c;
   }
 



    

  }
    
    if(u<=n)
    {
    for(int j=l-1;j<u;j++)
        System.out.println(arr[j]);
    }
    else{
        for(int j=l-1;j<n;j++)
        System.out.println(arr[j]);
    }

    

  
        
       
    


    }
}
    

