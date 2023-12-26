

public class Logic46 {
	public static void main(String[] args) {
	int no=64;
	while(no>9)
	{
		no=numsum(no);
		
	}
	System.out.println(no);
	}
	
	
static int numsum(int no)
{
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	return sum;
}
}
