package Execution;

public class pgm5 {
	static String palindrome(String str)
	{
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
			if(str.equals(rev))
			{
				System.out.println("String is a palindrome");

			}
			else
			{
				System.out.println(" not a palindrome");
			}
			return rev;
		
	}
	public static void main(String[] args) 
	{
		String str="dad";
		String res=palindrome(str);
		
		
	}
}