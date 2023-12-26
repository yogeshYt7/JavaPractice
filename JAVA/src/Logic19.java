

import java.util.Scanner;

public class Logic19 {
	static int add(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%3==0)
			{	
				sum=sum+rem;
			}
			no=no/10;
			
		}
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
