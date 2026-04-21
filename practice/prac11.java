//m finds the most frequently occurring letter pair (start letter, end letter) in a sentence. If multiple pairs have the same maximum frequency, it returns them in the order they appear.
import java.util.*;

public class prac11 {
    public static String mostFrequentPair(String S) {
        String[] words = S.split("\\s+");
        Map<String, Integer> freq = new LinkedHashMap<>();
        for (String word : words) {
            if (word.length() > 0) {
                String pair = "" + word.charAt(0) + word.charAt(word.length() - 1);
                freq.put(pair, freq.getOrDefault(pair, 0) + 1);
            }
        }
        int maxFreq = 0;
        if (!freq.isEmpty()) {
            maxFreq = Collections.max(freq.values());
        }
        for (String key : freq.keySet()) {
            if (freq.get(key) == maxFreq) 
                return key;
        }
        return "";
    }
    public static void main(String[] args) {
        String S =   "she is good greed god and ground player plotter";
        System.out.println(mostFrequentPair(S));
    }
}