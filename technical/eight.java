import java.util.*;
public class eight {
    
   public static void main(String[] args) {
    String arr[]={"dog","man","abg","dbg","dmg","doooog","gffewm"};
    int n=arr.length;
    HashMap<String , Integer> map=new HashMap<>();
    for(String st:arr){
        String s=st;
        char[] ch=s.toCharArray();
        String s1=""+ch[0]+ch[ch.length-1];
        map.put(s1,map.getOrDefault(s1,0)+1);
    }
    int max=Integer.MIN_VALUE;
    String finali="";
    for(String key:map.keySet()){
        if(map.get(key)>max){
            max=map.get(key);
            finali=key;
        }
       
        
    }
     System.out.println(finali);
    
 
   
    
}
}
