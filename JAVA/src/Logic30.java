

public class Logic30 {
	public static void main(String[] args) {
		
	
	int no=28;
	int sum=0;
	for(int i=1;i<=no/2;i++)
	{
		if(no%i==0)
		{
			sum=sum+i;
		}
	}
	if(no==sum)
	{
		System.out.println("Perfect number");
	}
	else
	{
		System.out.println("Not perfect number");
	}
	}
}
