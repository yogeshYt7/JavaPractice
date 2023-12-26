package Programming;

import java.util.Scanner;

public class Scanner1 {



	public static void main(String [] args)
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("enter a&b values in integer type");
		int a= Sc.nextInt();
		int b= Sc.nextInt();
		int c=a+b;
		System.out.println(c);
	}
}