import java.util.*;
public class matrix {
    public static void main(String args[]){
        System.out.println("enter index");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int ld=0,rd=0 ;
        for(int i=0;i<n;i++){
            ld+=arr1[i][i];
            rd+=arr1[i][n-1-i];
        }
        
        System.out.println(ld+" "+rd);


        

        for(int i=0;i<n;i++){
           
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+" ");
            }
             System.out.println();
        }
        
    }
    
}
