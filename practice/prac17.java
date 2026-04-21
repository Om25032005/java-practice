public class prac17 {
    public static void main(String[] args){
        String s1="aabbbccdeeea";
        StringBuilder s2=new StringBuilder();
        int i=0;

        while(i<s1.length()){

            int j=i+1;
                while(j<s1.length() && s1.charAt(i)==s1.charAt(j))
                    j++;
                 if(s2.length()==0 ||  s2.charAt(s2.length()-1)!='#'){
                   if( j-i>1)
                        s2.append('#');
                 }
                 else
                    s2.append(s1.charAt(i));
            i=j;
        }
        
        System.out.println(s2);
    }
    
}
