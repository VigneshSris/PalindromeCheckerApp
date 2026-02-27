/**
 * PalindromeCheckerApp
 * -----------------------------------------
 * Application Name  : Palindrome Checker App
 * Version           : 1.0
 * Description       : Demonstrates UC1, UC2, UC3 and UC4 combined.
 */

public class PalindromeCheckerApp {

    // Main Method - Entry point of the Java Application
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

        System.out.println("\n[UC3] Using String Reverse Logic");
        System.out.println("Reversed Word : " + reversed);

        if (word.equals(reversed)) {
            System.out.println("Result : Palindrome (Using Reverse Method)");
        } else {
            System.out.println("Result : Not a Palindrome (Using Reverse Method)");
        }

        // =============================
        // UC4 - Character Array Method
        // =============================
        char[] characters = word.toCharArray();
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("\n[UC4] Using Character Array (Two-Pointer)");
        if (isPalindrome) {
            System.out.println("Result : Palindrome (Using Char Array Method)");
        } else {
            System.out.println("Result : Not a Palindrome (Using Char Array Method)");
        }

        System.out.println("\nProgram Exited Successfully.");
        System.out.println("======================================");
    }
}