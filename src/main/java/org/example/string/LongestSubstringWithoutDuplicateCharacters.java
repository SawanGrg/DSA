package org.example.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDuplicateCharacters {

    public static int counter( String s){

        int left = 0;
        int maxLength= 0;

        Set<Character> window = new HashSet<>();

        for(int right = 0; right < s.length(); right ++ ){
            char current = s.charAt(right);

            // If current character already in window, shrink window from left
            while (window.contains(current)) {
                window.remove(s.charAt(left));
                left++;
            }

            // Add current character to the window
            window.add(current);

            // Update max length without Math.max
            int currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String holder = "pwwkew";
        System.out.println(" longest substring without duplicate character : " + counter(holder));
    }
}
