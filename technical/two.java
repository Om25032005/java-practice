
class two{
    public static void main(String[] args) {
        int[] arr={10,10,3,7,6};
        int total=0;
        int prefix=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        for(int i=0;i<arr.length-1;i++){
            prefix+=arr[i];
            int suffix=total-prefix;
            if((prefix+suffix)%2==0)
            cnt++;
           

        }
        System.out.println(cnt);
        System.out.println(5 | 9);
    }

}