package Programming1;
import java.util.Scanner;

public class Revstr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        int count = countFourLetterWordsWithO(sentence);
        System.out.println("Number of 4-letter words containing 'o': " + count);
    }

    public static int countFourLetterWordsWithO(String sentence) {
        String[] words = sentence.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.length() == 4) {
                char[] characters = word.toCharArray();
                for (char c : characters) {
                    if (c == 'o' || c == 'O') {
                        count++;
                        break; // Once 'o' is found, no need to check the rest of the characters in the word.
                    }
                }
            }
        }

        return count;
    }
}
