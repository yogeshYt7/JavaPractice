package YOGESH;

public class pgmmmm3 {
public static void main(String[] args) {
	String str="preetham kumar";
	String str2="";
	char[] ch=str.toCharArray();
//	char[] ch2=str2.toCharArray();
	int count=0;
	for (int i = 0; i < ch.length; i++) 
	{
		if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			System.out.println(ch[i]);
			count++;
			
		}else 
		{
			
			str2+=ch[i];

		}
	}
	System.out.println(count);
	System.out.print(str2);
	
}
}
