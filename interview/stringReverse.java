class stringReverse{
    public static String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
          sb.reverse();
        String rs=sb.toString();
        return rs;
    }
    
    public static void main(String[] args) {
        System.out.println(reverse("omkar "));
        
    }
}