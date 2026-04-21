public class nine {
    public static void main(String[] args) {
        String s1="226";
        int cnt=0;
        char s[]=s1.toCharArray();
        for(int i=0;i<s.length;i++){
            for(int j=i;j<s.length;j++){
                String s2=""+s[i]+s[j];
                int n=Integer.parseInt(s2);
                if(n<=26)
                cnt++;

            }
        }
        System.out.println(cnt);
    }
    
}
