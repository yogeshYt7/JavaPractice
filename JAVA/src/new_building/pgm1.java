package new_building;

public class pgm1 {

	public static void main(String[] args)
	{
	int n=7;
	prime(n);
	}
	static void prime(int n)
	{
	 for(int i=2;i<=n;i++)
	{
    boolean flag=true;
	if(n%i==0)
	{
	flag=false;
	break;
	}
	if(flag)
	{
	System.out.println("prime");
	break;
	}
	}
	}
	}

