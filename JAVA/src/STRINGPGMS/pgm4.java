package STRINGPGMS;

public class pgm4 {

	public static void main(String[] args) {
        String str="helloll";
        String s2="lloll";
        String rev="";
        str=str.substring(2);
        
        for(int i=str.length()-1;i>=0;i--) {
        	rev=rev+str.charAt(i);
        }
         
        if(str.equals(rev)) {
        	System.out.println("String palindrome");	
        }
        else
        {
        	System.out.println(" Not a String palindrome");
        }
	}

}
