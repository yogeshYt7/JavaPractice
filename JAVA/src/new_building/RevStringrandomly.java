package new_building;

public class RevStringrandomly {
	public static void main(String[] args) {
		String str="i love india";
		char[] ch=str.toCharArray();
		str=str.replaceAll(" ","");
		int j=str.length()-1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				ch[i]=str.charAt(j);
				j--;
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}

}
