

import java.util.Scanner;

public class Logic38 {
	double area(int b,int h)//Parallelogram area
	{
		double res=b*h;
		return res;
	}
	public static void main(String[] args) {
		Logic38 l1=new Logic38();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the b and h values");
		int a=s.nextInt();
		int c=s.nextInt();
		double x=l1.area(a,c);
		System.out.println(x);
	}
}
