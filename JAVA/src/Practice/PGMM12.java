package Practice;
import java.util.Scanner;
import java.util.Iterator;

public class PGMM12 {
	public static void main(String[] args) 
	{ 
		Scanner Sc=new Scanner(System.in);
		String str=Sc.next();
		char[] ch=str.toCharArray();
		String str1=""; 
		String str2=""; 
		String str3=""; 
		String str4=""; 
		
		for (int i = 0; i < ch.length; i++) 
		{
			
			if (ch[i]>=65&&ch[i]<=95) 
			{
				str1+=ch[i];
			}
			if (ch[i]>=97&&ch[i]<=122) {
				str2+=ch[i];
			}
			if (ch[i]>=33&&ch[i]<=38||ch[i]==64) {
				str3+=ch[i];
			}
			if (ch[i]>=48&&ch[i]<=57) {
				str4+=ch[i];
			}
		}
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
