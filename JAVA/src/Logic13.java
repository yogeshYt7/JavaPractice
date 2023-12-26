
import java.util.*;
public class Logic13 
{
		static String reverse(String str) 
		{
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println(str+" is palindrome");
		}
		else{
			System.out.println(str+" is not a palindrome");
		}
		return reverse;
}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Eneter the string to reverse:");
			String a=sc.nextLine();
			String b=reverse(a);
			System.out.println(b+" is the reversed string");
		}
		

}
