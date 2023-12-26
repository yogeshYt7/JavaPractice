
import java.util.*;
public class Logic42 {
	void prcheck(int c,int d)//prime no range
	{
		for(int j=c;j<=d;j++)
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
