package Practice;

public class PrimeNoCountHappy {

	

	public static void main(String[] args) 
	{     int count=0;
		
		for (int i =10 ; i <=70; i++) 
		{
			
			int no=i;
			boolean flag =true;
			for (int j = 2; j <no; j++) 
			{
				
				if (no%j==0) 
				{
					flag=false;
					break;
				}
			}
			
		if (flag ==true) 
		{
			System.out.println(no);
			count++;
		}
	}
		System.out.println("count of prime"+count);	
		if (count%2==0)
		{ 
			int no=count;
			while (no>9)
			{
				no=numSum(no);
			}
			if (no==1||no==7) 
			{
				System.out.println("happynumber");
			}else {
				System.out.println("not a happynumber");
			}

		}
		else if(count%2==1) 
		{
			singledigit(count);
			
		}
}

	private static void singledigit(int count) {
		int num =count;
		while (num>count) 
		{
			num=singleSum(num);
		}
//		System.out.println(num);
	}

	private static int singleSum(int num) 
	{
		int sum=0;
		while (num!=0) 
		{
			int rem =num%10;
			sum+=rem;
			num=num/10;
			
		}
				return sum;
	}

	private static int numSum(int no) {
		int sum=0;
		while (no!=0) 
		{
			int rem =no%10;
			sum+=rem*rem;
			no=no/10;
		}return sum;
	}

}