package Programming1;
import java.util.Scanner;
public class Leapyear {
	static boolean leapyear(int no) {
	boolean divby4=(no%4==0);
	boolean divby100=(no%100==0);
	boolean divby400=(no%400==0);
	return(divby4&& !divby100)|| divby400;
	}
public static void main(String[] args) {
	Scanner S1=new Scanner(System.in);
	int no=S1.nextInt();
	System.out.println("enter number");
	
			if (leapyear(no))
			{
			System.out.println(no+ " is leap year");
				
			}
	}
	
  }

