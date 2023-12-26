package new_building;

public class Leapyearrange {
	
		static boolean leapYear(int no)
		{
			boolean divby4=(no%4==0);
			boolean divby100=(no%100==0);
			boolean divby400=(no%400==0);
			
			return (divby4 && !divby100)||divby400;		
		}
		public static void main(String[] args) {
		
			for(int no=2000;no<=2101;no++)
			if(leapYear(no))
			{
				System.out.println(no+" is a leap year");
			}
			
		}

	}


