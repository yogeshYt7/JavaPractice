package STRINGPGMS;

/* without split and tocharArray()
 * 
 * ip---->knowledge
 * op---->ledgewonk
 * 
 * */

public class Partialreverse {
    public static void main(String[] args) {
        String str = "knowledge";
        String s = str.substring(0,4);
        String rev="";
        for (int i =str.length()/3; i >= 0; i--)
        {
            rev= rev + s.charAt(i);
            System.out.println(rev);
        }

        System.out.println(str.substring(4)+rev);
    }
}

