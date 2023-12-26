package Execution;

public class pgm7 {
    public static void main(String[] args) {
        String input = "L!@#ev432e#$8L$#";
        String result = checkAndFormatPalindrome(input);
        System.out.println(result);
    }

    static String checkAndFormatPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "");
        if (isPalindrome(cleanedInput)) {
            return cleanedInput + " is a palindrome";
        } else {
            return cleanedInput + " is not a palindrome";
        }
    }

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}