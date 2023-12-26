

public class Logic44 {
	public static void main(String[] args) {
		int no=3453;
		numsum(no);
		
	}
	static void numsum(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("Sum is => "+sum);
		prime(sum);
	}
	static void prime(int no)
	{
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%1==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a Prime number");
		}
	}

}
