package new_building;

public class Patternprinting {
	public static void main(String[] args) {
		String str="hello java how are you";
		System.out.println(str);
		char[] ch=str.toCharArray();
		System.out.print((char) (ch[0]-32));
		for(int i=1;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				ch[i+1]=(char) (ch[i+1]-32);
			}
		}
		for(int i=1;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}

}
