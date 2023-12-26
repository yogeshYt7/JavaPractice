

import java.util.Scanner;

public class Logic41 {
	double area(int r,double deg)//Sector area
	{
		double res=1/2.0*r*r*deg;
		return res;
	}
	public static void main(String[] args) {
		Logic41 l1=new Logic41();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the r and deg values");
		int a=s.nextInt();
		double c=s.nextDouble();
		double x=l1.area(a,c);
		System.out.println(x);
	}

}
