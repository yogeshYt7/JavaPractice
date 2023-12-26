

public class Logic45 {
	public static void main(String[] args) {
		int no=145;
		numsum(no);
	}
	static void numsum(int no)
	{
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+factorial(rem);
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.println("Strong number");
		}
		
	}
	static int factorial(int no)
	{
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	

}
