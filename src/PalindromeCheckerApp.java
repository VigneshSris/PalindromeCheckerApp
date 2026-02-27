/**
 * PalindromeCheckerApp
 * -----------------------------------------
 * Combined Implementation of UC1 to UC6
 * Demonstrates multiple palindrome checking techniques.
 */

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // =============================
        // UC1 - Welcome Message
        // =============================
        System.out.println("======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("======================================");
        System.out.println("Application Version : 2.0");
        System.out.println("--------------------------------------");
        System.out.println("Program Started Successfully!");
        System.out.println("======================================");

        // =============================
        // UC2 - Hardcoded String
        // =============================
        String word = "madam";
        System.out.println("\nInput Word : " + word);

        // =============================
        // UC3 - Reverse Using Loop
        // =============================
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("\n[UC3] Reverse Using Loop");
        System.out.println("Reversed Word : " + reversed);

        if (word.equals(reversed)) {
            System.out.println("Result : Palindrome (Reverse Method)");
        } else {
            System.out.println("Result : Not a Palindrome (Reverse Method)");
        }

        // =============================
        // UC4 - Character Array (Two Pointer)
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

        System.out.println("\n[UC4] Character Array (Two-Pointer)");
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

        System.out.println("\n[UC5] Stack (LIFO)");
        if (isPalindromeStack) {
            System.out.println("Result : Palindrome (Stack Method)");
        } else {
            System.out.println("Result : Not a Palindrome (Stack Method)");
        }

        // =============================
        // UC6 - Queue + Stack Method
        // =============================
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);      // Enqueue (FIFO)
            stack2.push(ch);    // Push (LIFO)
        }

        boolean isPalindromeQueueStack = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack2.pop()) {
                isPalindromeQueueStack = false;
                break;
            }
        }

        System.out.println("\n[UC6] Queue (FIFO) + Stack (LIFO)");
        if (isPalindromeQueueStack) {
            System.out.println("Result : Palindrome (Queue + Stack Method)");
        } else {
            System.out.println("Result : Not a Palindrome (Queue + Stack Method)");
        }

        System.out.println("\n======================================");
        System.out.println("All Use Cases Executed Successfully!");
        System.out.println("======================================");
    }
}