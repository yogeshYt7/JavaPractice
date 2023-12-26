package dynamic;

import java.util.Scanner;

public class Logic8 {
	static String reverse1(String str) 
	{
		String[] s1=str.split(" ");
		String rev=" ";
		for(int i=s1.length-1;i>=s1.length/2;i--)
		{
			rev=rev+(s1[i]+" ");
		
		}
		return rev;
		
	}
	static String reverse2(String str)
	{
		String[] s1=str.split(" ");
		String pt=" ";
		for(int i=0;i<=s1.length/2-1;i++)
		{
			pt=pt+(s1[i]+" ");
		
		}
		return pt;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be reversed:");
		String a=sc.nextLine();
		String b=reverse1(a);
		String c=reverse2(a);
		System.out.print(b);
		System.out.println(c);
		}

}
