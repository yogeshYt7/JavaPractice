package PATTERNPGMS;
import java.util.Scanner;

public class VowelOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); // Convert to lowercase
        int vowelCount = 0;
        StringBuilder stringWithoutVowels = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            if ("aeiou".contains(String.valueOf(c))) {
                System.out.print(c + " ");
                vowelCount++;
            } else {
                stringWithoutVowels.append(c);
            }
        }

        System.out.println();
        System.out.println("String without vowels: " + stringWithoutVowels);
        System.out.println("Number of vowels in the string: " + vowelCount);

    }
}
