

import java.util.Scanner;

public class Logic43 {
	void prcheck(int c,int d)//prime no range starting from next prime than given starting prime no
	{
		for(int j=c+1;j<=d;j++)//check
		{
			int no=j;
			boolean flag=true;
			for(int i=2;i<no;i++)
			{
				if(no%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(no+" is a prime number");
				
			}
		}
	}
	public static void main(String[] args) {
		Logic42 l1=new Logic42();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the j and no values");
		int a=s.nextInt();
		int b=s.nextInt();
		l1.prcheck(a, b);
	}

}
