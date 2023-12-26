package Programming;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Panagram {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();
	        
	        if (isPangram(input)) {
	            System.out.println("The entered string is a pangram.");
	        } else {
	            System.out.println("The entered string is not a pangram.");
	        }
	    }
	    
	    public static boolean isPangram(String str) {
	        Set<Character> characters = new HashSet<>();
	        str = str.toLowerCase(); // Convert to lowercase to handle both cases
	        
	        for (char ch : str.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                characters.add(ch);
	            }
	        }
	        
	        return characters.size() == 26; // Check if all letters of the alphabet are present
	    }
	}
