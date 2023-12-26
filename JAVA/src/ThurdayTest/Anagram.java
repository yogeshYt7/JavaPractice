package ThurdayTest;

//Ascii value r--114 a--97  c--99 e--101
// program to chec anagram or not using only for each and toCharArray() and not using any inbuilt methods
public class Anagram {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";

        if (s1.length()==s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();

            int sum1 = 0;
            int sum2 = 0;

            for (char c : c1) {
                sum1 = sum1+(int)c;
            }

            for (char c : c2) {
                sum2= sum2 +(int)c;
            }
            if (sum1 == sum2) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an anagram");
            }
            
            }
        else {
            System.out.println("Not an anagram");
        }
    }
}
