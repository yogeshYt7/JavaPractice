package Programming1;

public class strngcaptials {
	public static void main(String[] args) {
		String str="hi java how are you";
		char[] ch=str.toCharArray();
		ch[0]=(char)(ch[0]-32);
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				ch[i+1]=(char)(ch[i+1]-32);
			}
		}
		System.out.println(ch);

		
	}

}
