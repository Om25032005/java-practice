import java.util.*;
public class duplicate {

    public static int[] duplicat(int [] arr){
        Arrays.sort(arr);
        HashSet<Integer> list=new HashSet<>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1]){
                list.add(arr[i]);
            }
        }
        int [] dupl=new int[list.size()];
        int cnt=0;
        for(int n:list){
            dupl[cnt]=n;
            cnt++;
        }

        return dupl;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,3,3,45,2};
        arr=duplicat(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
