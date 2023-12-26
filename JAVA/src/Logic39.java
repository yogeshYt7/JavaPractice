

import java.util.Scanner;

public class Logic39 {
	double area(int r)//Circle area
	{
		final double pi=3.142;
		double res=pi*r*r;
		return res;
	}
	public static void main(String[] args) {
		Logic39 l1=new Logic39();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the r value");
		int a=s.nextInt();
		double x=l1.area(a);
		System.out.println(x);
	}

}
