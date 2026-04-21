
public class Case {
    public static void main(String args[]){
    String str1="";
    if(str1.equals(""))
        System.out.println("Invalid");
    char[] str=str1.toCharArray();
    int upper=0;
    int lower=0;
    for(int i=0;i<str.length;i++){
        if(Character.isUpperCase(str[i]))
            upper++;
        else
            lower++;   
    }
    if(upper<lower)
        str1=str1.toLowerCase();
    else
        str1=str1.toUpperCase();
    System.out.println(str1);

}
}
