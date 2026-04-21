import java.util.*;

public class LongestSubstringLoop {

    public static String longestSubstring(String s) {
        int left = 0;                       // start of window
        int maxLen = 0;                     // longest length found
        int start = 0;                      // starting index of answer
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // if duplicate found, shrink window from left
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            // add current character to window
            set.add(c);

            // check if current window is longest
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }

        // return the actual substring
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println("Input: " + s1);
        System.out.println("Longest Substring: " + longestSubstring(s1)); // abc

        String s2 = "bbbbb";
        System.out.println("Input: " + s2);
        System.out.println("Longest Substring: " + longestSubstring(s2)); // b

        String s3 = "pwwkew";
        System.out.println("Input: " + s3);
        System.out.println("Longest Substring: " + longestSubstring(s3)); // wke
    }
}
