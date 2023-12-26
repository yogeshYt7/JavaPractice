package ThurdayTest;

public class palindrome {
	
public static void main(String[] args) {
	String str="LeVel";
	String str1="STates";
	palidrome(str);
	palidrome(str1);

}

 static void palidrome(String str) {
	 String rev="";
	 for(int i=str.length()-1;i>=0;i--) {
		 rev=rev+str.charAt(i);
	 }
	 if(str.equalsIgnoreCase(rev)) {
		 System.out.println("String palindrome");
	 }else {
		 System.out.println("NOT A String palindrome");		 
	 }
}
}
