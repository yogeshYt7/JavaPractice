package STRINGPGMS;

/*  input----->language
 * output---->egaugnal
 * 
 * without using any loop,tocharArray(),split and reversemethod()
 * 
 * 
 * 
 * 
 * */

public class Partialreverse1 {
    public static String reverse(String input) {
        if (input.isEmpty() || input.length() == 1) {
            return input;
        }
        
        return reverse(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        String input = "language";
        String reversed = reverse(input);
        System.out.println(reversed); 
    }
}
