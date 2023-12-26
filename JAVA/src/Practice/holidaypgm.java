package Practice;

public class holidaypgm {
	public static void main(String[] args) {
		      boolean vacation = false;
			boolean weekday = false;
			System.out.println(sleepin(weekday,vacation));
	}
		
		public static boolean sleepin(boolean weekday,boolean vacation)
		{
			if (!weekday||vacation) 
			{
				return true;
			}
			return false;
		}
	}

