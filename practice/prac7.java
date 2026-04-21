//Expanded String
//This program expands a string S by repeating each character based on its first 1-based index of occurrence. Characters in the output string are separated by hyphens.
import java.util.*;
public class prac7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        StringBuilder s2=new StringBuilder();

        int arr[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            int index=ch-'a';
            if(arr[index]==0)
            arr[index]=i+1;
          
            
        }
        for(int i=0;i<s1.length();i++){
            int index =s1.charAt(i)-'a';
            for(int j=0;j<arr[index];j++)
                s2.append(s1.charAt(i));
             if(i<s1.length()-1)
                s2.append('-');
               
            

        }
        System.out.println(s2);

    }
    
}
