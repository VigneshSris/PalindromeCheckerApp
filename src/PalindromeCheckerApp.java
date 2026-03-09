/**
 * PalindromeCheckerApp
 * -----------------------------------------
 * Final Combined Implementation of UC1 to UC7
 * Demonstrates multiple palindrome validation techniques.
 */

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // =============================
        // UC1 - Welcome Message
        // =============================
        System.out.println("======================================");
        System.out.println("        PALINDROME CHECKER APP        ");
        System.out.println("======================================");
        System.out.println("Application Version : 3.0");
        System.out.println("--------------------------------------");
        System.out.println("All Use Cases (UC1 - UC7)");
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
        System.out.println("Result : " +
                (word.equals(reversed) ? "Palindrome" : "Not a Palindrome"));

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
        System.out.println("Result : " +
                (isPalindromeChar ? "Palindrome" : "Not a Palindrome"));

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
        System.out.println("Result : " +
                (isPalindromeStack ? "Palindrome" : "Not a Palindrome"));

        // =============================
        // UC6 - Queue + Stack Method
        // =============================
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);
            stack2.push(ch);
        }

        boolean isPalindromeQueueStack = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack2.pop()) {
                isPalindromeQueueStack = false;
                break;
            }
        }

        System.out.println("\n[UC6] Queue (FIFO) + Stack (LIFO)");
        System.out.println("Result : " +
                (isPalindromeQueueStack ? "Palindrome" : "Not a Palindrome"));

        // =============================
        // UC7 - Deque Based Method
        // =============================
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindromeDeque = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindromeDeque = false;
                break;
            }
        }

        System.out.println("\n[UC7] Deque (Front & Rear Comparison)");
        System.out.println("Result : " +
                (isPalindromeDeque ? "Palindrome" : "Not a Palindrome"));

        System.out.println("\n======================================");
        System.out.println("All Use Cases Executed Successfully!");
        System.out.println("======================================");
    }
}

// =============================
// UC8 - LinkedList Based Method
// =============================
LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
        list.add(word.charAt(i));
        }

boolean isPalindromeLinkedList = true;

        while (list.size() > 1) {

char first = list.removeFirst();
char last = list.removeLast();

            if (first != last) {
isPalindromeLinkedList = false;
        break;
        }
        }

        System.out.println("\n[UC8] LinkedList (removeFirst & removeLast)");
        System.out.println("Result : " +
                                   (isPalindromeLinkedList ? "Palindrome" : "Not a Palindrome"));
        // =============================
// UC9 - Recursive Palindrome Checker
// =============================

        import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base condition: if start >= end, it's a palindrome
        if (start >= end) {
            return true;
        }
        // If mismatch, not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC9 - Recursive Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Result: " + (result ? "Palindrome" : "Not a Palindrome"));
        System.out.println("=========================================");

        scanner.close();
    }
}