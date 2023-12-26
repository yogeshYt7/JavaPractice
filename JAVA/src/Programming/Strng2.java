package Programming;

public class Strng2 {
	public static void main(String[] args) {
		String s1="mava1 athey2 rama3 pavan4";
		s1.replaceAll("a","6");
		String s2=s1.replaceAll("a","6");
		System.out.println(s2.replaceAll("[1-4]","7"));
	}

}
