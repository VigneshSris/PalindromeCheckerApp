import java.util.Stack;

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return cleaned.equals(reversed);
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String testString = "madam";

        System.out.println("Input String: " + testString);

        if (checker.checkPalindrome(testString)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}