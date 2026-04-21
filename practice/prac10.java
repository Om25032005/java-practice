//  String Transformation
// This program calculates the minimum cost to transform one string S1 into another string S2. The cost is based on the number of characters that need to be added to S1 to match S2.

// Removing a letter has a cost of 0.

// Swapping a pair of letters has a cost of 0.

// Adding a new letter to the end of S1 has a cost of 1.

// The minimum cost is simply the number of characters that exist in S2 but not in S1, counting multiplicitie
public class prac10 {
    public static void main(String args[]){
        String s1="ABDA";
        String s2="AABCCAD";
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        int cost=0;
        for(int i=0;i<s2.length();i++)
        {
            int index=s2.charAt(i)-'A';
            arr2[index]++;
        }
        for(int i=0;i<s1.length();i++)
        {
            int index=s1.charAt(i)-'A';
            arr1[index]++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]<arr2[i])
                cost+=arr2[i]-arr1[i];

        }
        System.out.println(cost);
        

    }
    
}
