

import java.util.Scanner;

public class Logic35 {
	double area(int w,int h)//Rectangle area
	{
		double res=w*h;
		return res;
	}
	public static void main(String[] args) {
		Logic35 l1=new Logic35();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the w and h values");
		int a=s.nextInt();
		int c=s.nextInt();
		double x=l1.area(a,c);
		System.out.println(x);
	}

}


