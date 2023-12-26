package STRINGPGMS;

//input hello java
//output avaj olleh
import java.util.Scanner;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        String reversed = "";

        for (String word : words) {
            String reversedWord = "";
            for (char ch : word.toCharArray()) {
                reversedWord = ch+reversedWord;
            }
            reversed = reversedWord+" "+reversed+" ";
        }

        System.out.println("Output: "+reversed.trim());
    }
}
