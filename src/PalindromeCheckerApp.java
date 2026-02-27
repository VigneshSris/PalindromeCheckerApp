/**
 * PalindromeCheckerApp
 * -----------------------------------------
 * Application Name  : Palindrome Checker App
 * Version           : 1.0
 * Description       : Demonstrates UC1 to UC5 combined.
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // =============================
        // UC1 - Welcome Message
        // =============================
        System.out.println("======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("======================================");
        System.out.println("Application Version : 1.0");
        System.out.println("--------------------------------------");
        System.out.println("Program Started Successfully!");
        System.out.println("======================================");

        // =============================
        // UC2 - Hardcoded String
        // =============================
        String word = "madam";
        System.out.println("\nHardcoded Word : " + word);

        // =============================
        // UC3 - Reverse Using Loop
        // =============================
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("\n[UC3] Using String Reverse Method");
        System.out.println("Reversed Word : " + reversed);

        if (word.equals(reversed)) {
            System.out.println("Result : Palindrome (Reverse Method)");
        } else {
            System.out.println("Result : Not a Palindrome (Reverse Method)");
        }

        // =============================
        // UC4 - Character Array Method
        // =============================
        char[] characters = word.toCharArray();
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindromeChar = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindromeChar = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("\n[UC4] Using Character Array (Two-Pointer)");
        if (isPalindromeChar) {
            System.out.println("Result : Palindrome (Char Array Method)");
        } else {
            System.out.println("Result : Not a Palindrome (Char Array Method)");
        }

        // =============================
        // UC5 - Stack Based Method
        // =============================
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindromeStack = true;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                isPalindromeStack = false;
                break;
            }
        }

        System.out.println("\n[UC5] Using Stack (LIFO)");
        if (isPalindromeStack) {
            System.out.println("Result : Palindrome (Stack Method)");
        } else {
            System.out.println("Result : Not a Palindrome (Stack Method)");
        }

        System.out.println("\nProgram Exited Successfully.");
        System.out.println("======================================");
    }
}