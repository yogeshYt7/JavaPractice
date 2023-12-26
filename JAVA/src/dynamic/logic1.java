package dynamic;

import java.util.Scanner;

public class logic1 {
	static String reverse(String str) 
	{
		String[] s1=str.split(" ");
		String rev=" ";
		for(int i=s1.length-1;i>=0;i--)
		{
			rev=rev+(s1[i]+" ");
		
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be reversed:");
		String a=sc.nextLine();
		String b=reverse(a);
		System.out.println(b);
		}
}