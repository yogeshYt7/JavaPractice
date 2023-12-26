package new_building;

public class Randompatwobfun {
	public static void main(String[] args) {
		String str="2a2b2c";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&& ch[i]<='9')
			{
				print(ch[i],ch[i+1]);
			}
		}
				
	}
	static void print(char ch1,char ch2)
	{
		int no=(int) (ch1-48);
		for(int k=1;k<=no;k++)
		{
			System.out.print(ch2);
		}
	}

}
