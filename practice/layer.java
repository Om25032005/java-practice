public class layer {
    public static void main(String[] args) {
        String s1="abbbccccdddde";
        int i=0;
        int cnt=0;
        int n=s1.length();
        while(i<n){
            if(cnt<n && s1.charAt(i)==s1.charAt(cnt)){
                cnt++;
            }
            else
            i++;
        }
            System.out.println(cnt);
    }
    
}
