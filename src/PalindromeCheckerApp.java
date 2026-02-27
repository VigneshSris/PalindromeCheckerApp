/**
 * PalindromeCheckerApp
 * -----------------------------------------
 * Application Name  : Palindrome Checker App
 * Version           : 1.0
 * Description       : Displays welcome message and checks a hardcoded palindrome.
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
        // UC2 - Hardcoded Palindrome Check
        // =============================

        // Hardcoded String Literal
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("\nChecking word: " + word);

        // Check if palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("Result: The given word is a Palindrome.");
        } else {
            System.out.println("Result: The given word is NOT a Palindrome.");
        }

        System.out.println("\nProgram Exited Successfully.");
        System.out.println("======================================");
    }
}