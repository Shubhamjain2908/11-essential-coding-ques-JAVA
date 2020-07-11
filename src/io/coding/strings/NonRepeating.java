package io.coding.strings;

import java.util.HashMap;
import java.util.Map;

public class NonRepeating {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        System.out.println(nonRepeating("abcab")); // should return 'c'
        System.out.println(nonRepeating("abab")); // should return null
        System.out.println(nonRepeating("aabbbc")); // should return 'c'
        System.out.println(nonRepeating("aabbdbc")); // should return 'd'
    }

    // Implement your solution below.
    public static Character nonRepeating(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}
