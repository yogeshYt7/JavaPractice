

import java.util.Scanner;

public class Logic40 {
	double area(int a,int b)//Ellipse area
	{
		final double pi=3.142;
		double res=pi*a*b;
		return res;
	}
	public static void main(String[] args) {
		Logic40 l1=new Logic40();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a and b values");
		int a=s.nextInt();
		int c=s.nextInt();
		double x=l1.area(a,c);
		System.out.println(x);
	}
}
