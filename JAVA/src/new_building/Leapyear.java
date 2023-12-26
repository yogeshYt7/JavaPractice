package new_building;

public class Leapyear {
	static boolean leapYear(int no)
	{
		boolean divby4=(no%4==0);
		boolean divby100=(no%100==0);
		boolean divby400=(no%400==0);
		
		return (divby4 && !divby100)||divby400;		
	}
	public static void main(String[] args) {
		int no=2024;
		if(leapYear(no))
		{
			System.out.println(no+" is a leap year");
		}
		else
		{
			System.out.println(no+" is not a leap year");
		}
	}

}
