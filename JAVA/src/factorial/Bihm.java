package factorial;

public class Bihm 
{
	static int number(String a)
	{
		int no=Integer.parseInt(a);
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
			return sum;
		
	}
	public static void main(String[] args)
	{
	  String str="1234";
	  
		
		int x=number(str);
		System.out.println(x);
		
	}

}
