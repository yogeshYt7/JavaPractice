package new_building;

public class Palindromeworeverse {
	static boolean palindrome(String str)
	{
		int i=0,j=str.length()-1;
		while(i<=j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String str="MAN";
		if(palindrome(str)==true)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
