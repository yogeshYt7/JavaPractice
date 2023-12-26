

import java.util.Scanner;

public class Logic36 {
	double area(int f)//Square area
	{
		double res=f*f;
		return res;
	}
	public static void main(String[] args) {
		Logic36 l1=new Logic36();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=s.nextInt();
		double x=l1.area(a);
		System.out.println(x);
	}

}

