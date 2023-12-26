package Practice;
//reverse a strting without using inbuilt  use only Charat and for loop
public class pgm13 {
	public static void main(String[] args) {
		String str ="hi how are you ";
		String str2=" ";
		String[]s1 = new String[5];
		int j=0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch= str.charAt(i);
			if (ch!=' ') 
			{
				str2+=ch;
			}else 
			{
				s1[j]=str2;
				j++;
				str2=" ";
			}
		}
		for (int i = s1.length-1; i>=0; i--) 
		{
			if (s1[i]!=null) 
			{
				System.err.print(s1[i]+" ");
			}
		}
		
	}

}
