
import java.util.Scanner;

public class Logic11 
{
	static int fact(int no)
	{
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the integer value of no:");
		int no=Sc.nextInt();
		int x=fact(no);
		System.out.println(x);
	}
}