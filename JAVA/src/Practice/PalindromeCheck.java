package Practice;

public class PalindromeCheck {
 
	public static void main(String[] args) {
		String str ="5?36@6?35";
		

		if(checkpalindrome(str))
		{
			System.out.println("yes");
		}else {
			System.out.println("NO");
		}

		
	}

	public static boolean checkpalindrome(String str)
	{
	 str=str.replaceAll("[!@#$%^&*]","");
	 str=str.toLowerCase();
	 str=str.replaceAll(" ","");
	 String rev="";
		for (int  i = str.length()-1;i>0; i--) 
		{ 
			rev+=str.charAt(i);	
		}
		if (rev.equals(str))
		{
			return true;
		}else {
			return false;
		}

	}
	

}
