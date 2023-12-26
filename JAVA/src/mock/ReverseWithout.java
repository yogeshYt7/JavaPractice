package mock;

public class ReverseWithout {

	public static void main(String[] args) {
		String str="java";
		char[] ch=str.toCharArray();
		String rev="";
		for (char c:ch) {
			rev=c+rev;
		}
		System.out.println(rev);
	}

}
