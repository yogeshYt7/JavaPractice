package Execution;

public class pgm2 {
    static String removeExtraSpaces(String input) {
        return input.replaceAll("\\s+", " ").trim();
    }

    public static void main(String[] args) {
        String sentence = "java is        programming        lanaguage   ";
        String result = removeExtraSpaces(sentence);
        System.out.println(result);
    }
}