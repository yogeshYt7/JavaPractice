package dynamic;

import java.util.Scanner;

public class Logic5 {
	static String pt(String str) 
	{
		String[] s1=str.split(" ");
		String pt=" ";
		for(int i=0;i<s1.length;i++)
		{
			if(i%2==0)
			{
				pt=pt+(s1[i]+" ");
			}
		}
		return pt;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be reversed:");
		String a=sc.nextLine();
		String b=pt(a);
		System.out.print(b);
	
		}

}
