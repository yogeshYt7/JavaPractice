package Execution;

public class pgm6 {
    public static void main(String[] args) {
        String input = "L#$@!an124gua&*^ge#%134";
        String reversed = reverseLettersOnly(input);
        System.out.println(reversed);
    }

    static String reverseLettersOnly(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "");
        char[] characters = cleanedInput.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    }
}