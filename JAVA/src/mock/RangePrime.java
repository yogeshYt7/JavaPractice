package mock;

public class RangePrime {

		public static void main(String[] args)
		{
		int start=1;
		int end=100;
		prime(start,end);
		}
		static void prime(int start,int end)
		{
		 for(int i=start;i<=end;i++)
		{
		 boolean flag=true;
		 int n=i;
		for(int j=2;j<n;j++)
		{
		if(n%j==0)
		{
		flag=false;
		break;
		}
		}
		if(flag)
		{
		System.out.println(n +" is a prime number");
		}
		}
		}
		}