import java.util.*;
public class stack {
   static class element {
    int data;
    int skip;

    element(int data, int skip){
        this.data=data;
        this.skip=skip;
    }
}
public static void main(String args[]){
    int s=9;
    
    Stack<element> st=new Stack<>();
    int totalSkipCount = 0; 
    int arr[]={3,1,4,2,5,1};
    for(int i=0;i<arr.length;i++){
        int skip=0;
        while(!st.isEmpty() && st.peek().data<arr[i]){
            skip++;
            st.pop();

        }

        totalSkipCount+=skip; 
            st.push(new element(arr[i],skip));

        

        }
        System.out.println(totalSkipCount);

    }


    
}

