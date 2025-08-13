package org.example.string;

import java.util.*;

public class ReverseWordsInString {

    public String reverseWords(String s) {
        System.out.println("Original input: '" + s + "'");

        // 1️⃣ Trim leading and trailing spaces
        String trimmed = s.trim();
        System.out.println("After trim(): '" + trimmed + "'");

        // 2️⃣ Split on one or more spaces using regex "\\s+"
        String[] words = trimmed.split("\\s+");
        System.out.println("After split(): " + Arrays.toString(words));

        // 3️⃣ Reverse the array
        List<String> wordList = Arrays.asList(words); // fixed-size list backed by array
        System.out.println("List before reverse: " + wordList);
        Collections.reverse(wordList); // reverses in place
        System.out.println("List after reverse: " + wordList);

        // 4️⃣ Join with single space
        String result = String.join(" ", wordList);
        System.out.println("Final joined string: '" + result + "'");

        return result;
    }

    public static void main(String[] args) {
        System.out.println("\nResult: " + new ReverseWordsInString().reverseWords("the world is blue"));
        System.out.println("\nResult: " + new ReverseWordsInString().reverseWords("  hello world  "));
        System.out.println("\nResult: " + new ReverseWordsInString().reverseWords("a good   example"));
    }
}
