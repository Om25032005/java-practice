public class bar {
    public static void main(String[] args) {
        int n=204567;
        int k=4;
        String s1=new String();
        //s1=Integer.toString(n);
        StringBuilder sb=new StringBuilder();
        s1=n+"";
        for(int i=0;i<s1.length();i++){
            int n1=s1.charAt(i)-'0';
            if((n1+k)>9){
                int ch='A'+n1+k-10;
                char c=(char)ch;
                sb.append(c);
            }
            else{
                   sb.append((n1+k+""));


            }
         
        }
        System.out.println(sb);
    }
    
}
