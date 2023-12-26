

import java.util.Scanner;

public class Logic25 {
	static int mul(int no)
	{
		int mul=1;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==1)
			{
				mul=mul*rem;
			}
				no=no/10;
			
		}
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
