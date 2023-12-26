package Testquestions;



public class Qus2 {
	public static void main(String[] args) {
		String str="java";
		for(int i=0;i<str.length();i++)
		{
			for(int j=str.length()-1;j>=0;j--)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println("Palindrome");
					break;
				}
				
			}
		
		System.out.println();
		break;
	}}

}
