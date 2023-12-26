package YOGESH;
public class StringManipulation {
    public static void main(String[] args) {
        String input = "a2b3c1";
        String output = generateOutput(input);
        System.out.println("Output: " + output);
    }

    public static String generateOutput(String input) {
        StringBuilder outputBuilder = new StringBuilder();
        int length = input.length();

        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                outputBuilder.append(currentChar);
            } else if (Character.isDigit(currentChar)) {
                // Convert the digit character to an integer
                int repeatCount = Character.getNumericValue(currentChar);
                
                // Repeat the previous character that many times
                if (i > 0) {
                    char previousChar = input.charAt(i - 1);
                    for (int j = 1; j < repeatCount; j++) {
                        outputBuilder.append(previousChar);
                    }
                }
            }
        }

        return outputBuilder.toString();
    }
}
