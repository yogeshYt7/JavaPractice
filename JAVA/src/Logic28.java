

import java.util.Scanner;

public class Logic28 {
	static int add(int no)
	{
		int lastdigit=no%10;
		int firstdigit=no;
		while(firstdigit>=10)
		{
			firstdigit/=10;
		}
			int sum=firstdigit+lastdigit;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value:");
		int a=sc.nextInt();
		int b=add(a);
		System.out.println(b);
	}

}
