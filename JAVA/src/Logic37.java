

import java.util.Scanner;

public class Logic37 {
	double area(int a,int b,int h)//Trapezoid area
	{
		double res=1/2.0*(a+b)*h;
		return res;
	}
	public static void main(String[] args) {
		Logic37 l1=new Logic37();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a, b & h values");
		int f=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		double x=l1.area(f,c,d);
		System.out.println(x);
	}

}
