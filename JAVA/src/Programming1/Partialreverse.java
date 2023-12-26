package Programming1;
/* without split and tocharArray()
 * 
 * ip---->knowledge
 * op---->wonkledge
 * 
 * */

public class Partialreverse {
    public static void main(String[] args) {
        String str = "knowledge";
        String s = str.substring(0,4);
//        System.out.println(s);
        String rev="";
        for (int i =str.length()/3; i >= 0; i--)
        {
            rev= rev + s.charAt(i);
           
        }
//        System.out.println(rev);

        System.out.println(rev+str.substring(4));
    }
}