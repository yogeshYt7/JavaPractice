package STRINGPGMS;

public class Reverseme {

	public static void main(String[] args) {

		String str="hello java";
		char[] ch=str.toCharArray();
		str=str.replaceAll(" ", "");
		int j=str.length()-1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ') 
			{
				ch[i]=str.charAt(j);
				j--;
			}else
			{
				ch[i+1]=str.charAt(j);
			}
		}
		for (int i = 0; i < ch.length; i++) 
		{
			System.out.print(ch);
			break;
		}
	}

}
