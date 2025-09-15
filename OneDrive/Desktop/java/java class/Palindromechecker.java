import java.util.*;
class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public void displayResult() {
        System.out.println("Input String: " + text);
        if (isPalindrome()) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: Not a Palindrome.");
        }
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madam");
        PalindromeChecker p2 = new PalindromeChecker("hello");
        PalindromeChecker p3 = new PalindromeChecker("A man a plan a canal Panama");

        p1.displayResult();
        p2.displayResult();
        p3.displayResult();
    }
}
