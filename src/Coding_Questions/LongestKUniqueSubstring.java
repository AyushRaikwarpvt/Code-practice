package Coding_Questions;

import java.util.HashMap;

public class LongestKUniqueSubstring {
    public static String findLongestSubstring(String s, int k) {
        int left = 0, maxLen = 0, startIndex = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            // Shrink window if unique chars > k
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }

            // If valid window, check for max length
            if (map.size() == k && (right - left + 1 > maxLen)) {
                maxLen = right - left + 1;
                startIndex = left;
            }
        }

        return maxLen == 0 ? "" : s.substring(startIndex, startIndex + maxLen);
    }

    public static void main(String[] args) {
        String str = "cabbacaaccazzz";
        int k = 3;
        String result = findLongestSubstring(str, k);
        System.out.println("Longest Substring with " + k + " unique characters: " + result);
    }
}

