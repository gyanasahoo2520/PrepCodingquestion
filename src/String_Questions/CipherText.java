package String_Questions;

import org.w3c.dom.UserDataHandler;

public class CipherText {

    public static void main(String[] args) {
        String input = "hello"; // Example input string
        String modifiedString = incrementDecrementAlternateChars(input);
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + modifiedString);
    }

    public static String incrementDecrementAlternateChars(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = incrementChar(chars[i]);
            } else {
                chars[i] = decrementChar(chars[i]);
            }
        }
        return new String(chars);
    }

    private static char incrementChar(char c) {
        if (c == 'z') return 'a'; // Wrap around from 'z' to 'a'
        if (c == 'Z') return 'A'; // Wrap around from 'Z' to 'A'
        return (char) (c + 1);
    }

    private static char decrementChar(char c) {
        if (c == 'a') return 'z'; // Wrap around from 'a' to 'z'
        if (c == 'A') return 'Z'; // Wrap around from 'A' to 'Z'
        return (char) (c - 1);
    }
}
