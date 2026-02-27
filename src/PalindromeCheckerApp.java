/**
 * PalindromeCheckerApp
 * -----------------------------------------
 * Application Name  : Palindrome Checker App
 * Version           : 1.0
 * Description       : Demonstrates UC1, UC2 and UC3 combined.
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

        // =============================
        // UC3 - Reverse Using Loop
        // =============================
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Display Original & Reversed
        System.out.println("\nOriginal Word  : " + word);
        System.out.println("Reversed Word  : " + reversed);

        // Compare using equals()
        if (word.equals(reversed)) {
            System.out.println("Result : The given word is a Palindrome.");
        } else {
            System.out.println("Result : The given word is NOT a Palindrome.");
        }

        System.out.println("\nProgram Exited Successfully.");
        System.out.println("======================================");
    }
}