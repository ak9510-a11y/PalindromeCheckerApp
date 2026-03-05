import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
        Stack<Character> stack = new Stack<>();
        boolean isPalindrome = true;

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters and compare
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}