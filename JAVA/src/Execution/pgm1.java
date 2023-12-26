package Execution;

public class pgm1 {
    static String replace(String input, char c1, char c2) {
        char[] str = input.toCharArray();
        int j = 0;
        int n = str.length;
        for (int i = 0; i < n; i++) {
            if (str[i] != c1) {
                str[j++] = str[i];
            } else {
                str[j++] = c2;
            }
        }
        return new String(str, 0, j);
    }

    public static void main(String[] args) {
        String input = "Fire";
        char C1 = 'F';
        char C2 = 'T';

        String result = replace(input, C1,C2);

        System.out.println(result);
    }
}