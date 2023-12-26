

import java.util.Scanner;

public class Logic29 {
	static int mul(int no)
	{
		int mul=1;
		int lastdigit=no%10;
		int firstdigit=no;
		while(firstdigit>=10)
		{
			firstdigit/=10;
		}
			 mul=firstdigit*lastdigit;
		return mul;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value:");
		int a=sc.nextInt();
		int b=mul(a);
		System.out.println(b);
	}

}
