import java.util.Stack;

import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        boolean isPalindrome = true;

        // Add characters to queue and stack
        for (int i = 0; i < input.length(); i++) {
            queue.add(input.charAt(i));   // Enqueue
            stack.push(input.charAt(i));  // Push
        }

        // Compare dequeue and pop
        for (int i = 0; i < input.length(); i++) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}