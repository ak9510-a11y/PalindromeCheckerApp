import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = true;
        char[] ch = input.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);

    }
}