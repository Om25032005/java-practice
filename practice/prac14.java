//Largest Absolute Difference
// This program finds the largest absolute difference between the count of the fruit with the maximum odd frequency and the count of the fruit with the minimum even frequency from a given string.
import java.util.*;
class prac14{
    public static void main(String[] args) {
        String s1="affffffffaaartfffu";
        char[] s2=s1.toCharArray();
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s2.length;i++)
            freq.put(s2[i],freq.getOrDefault(s2[i], 0)+1);
        
        int odd=0,even=0;
    
        for(char i:freq.keySet()){
            if(freq.get(i)%2 !=0)
                odd=Math.max(odd,freq.get(i));
            else
                 even=Math.min(even,freq.get(i));
        }
        System.out.println(Math.abs(odd-even));
        
    }
}