
public class lcs {
    public static void main(String args[]){
       char s1[]={'b','c','d','a','a','c','d'};
       char s2[]={'a','c','d','b','a','c'};
       int r=s1.length;
       int c=s2.length;
       int arr[][]=new int[r][c];
       for(int i=0;i<r;i++)
            arr[i][0]=0;
       for(int j=0;j<c;j++)
            arr[0][j]=0;


        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(s1[i]==s2[j])
                arr[i][j]=arr[i-1][j-1]+1;
                else
                arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);

            }
        }
        System.out.print(arr[r-1][c-1]);
    }
    
}
