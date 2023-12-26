package Presentation;

public class pgm1 {
	public static void main(String[] args) {
		String S="Abhi waste fellow";
		System.err.println(S.length());
		char[]str=S.toCharArray();
		int count=0;
		for (int i = 0; i < str.length; i++)
		{
			count++;
		}
		System.err.println(count);
	}
}
