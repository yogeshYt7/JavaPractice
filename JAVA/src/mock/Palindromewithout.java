package mock;

public class Palindromewithout {

	public static void main(String[] args) {
	String str="malayalam";
	if(palidrome(str)) {
		System.out.println("String palindrome");
	}
}

 static boolean palidrome(String str) {
	 char[] ch=str.toCharArray();
	 int i=0,j=ch.length-1;
	 while(i<j) {
		 if(ch[i]!=ch[j]) {
			 return false;
		 }
		 i++;
		 j--;
	 }
	 return true;
}
}
