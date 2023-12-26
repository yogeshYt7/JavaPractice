package YOGESH;

public class PrimeNo {
     public static void main(String[] args)
     {
		int no=25;
		int sum=0;
		while(no!=0)
		{  
			int rem=no%10;
			sum+=rem;
			no/=10;
					
		}
		System.out.println("sum is =>" + sum);
				
				int n=sum;
				boolean flag=true;
	for(int i=2; i<n;i++)
      {
		   if(n%i==0)
		    {
					flag=false;
					break;
			}
	 }

	 if(flag==true)
	{
	System.out.println(" prime number");
	}
	else
		{
		 System.out.println( " not a prime number");
		}
     }
}
