package Practice;

public class PangramChecker {
	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		boolean isPangram = isPangram(input.toLowerCase());
		if (isPangram) {
			System.out.println("The input is a pangram.");
		} else {
			System.out.println("The input is not a pangram.");
		}
	}

	public static boolean isPangram(String str) {
		boolean[] alphabet = new boolean[26];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLetter(c)) {
				alphabet[c - 'a'] = true;
			}
		}

		for (boolean letterSeen : alphabet) {
			if (!letterSeen) {
				return false;
			}
		}

		return true;
	}
}
