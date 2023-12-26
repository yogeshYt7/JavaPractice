package new_building;

public class Palinpattern {
	public static boolean checkPalin(String str)
	{
		
		String str2=str.replaceAll("[' '?@]", "");
		str2=str2.toLowerCase();
		String rev="";
		for(int i=str2.length()-1;i>=0;i--)
		{
			rev=rev+str2.charAt(i);
		}
		if(str2.equals(rev))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		String str1="5?36@6?35";
		checkPalin(str1);
		if(checkPalin(str1))
		{
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not");
		}
	}
}
