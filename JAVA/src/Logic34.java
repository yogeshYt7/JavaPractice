
import java.util.*;
public class Logic34 {
	double area(int b,int h)//Triangle area
	{
		double res=1/2.0*b*h;
		return res;
	}
	public static void main(String[] args) {
		Logic34 l1=new Logic34();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the b and h values");
		int a=s.nextInt();
		int c=s.nextInt();
		double x=l1.area(a,c);
		System.out.println(x);
	}

}
