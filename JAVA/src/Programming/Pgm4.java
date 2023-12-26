package Programming;

public class Pgm4 {
	static void printrange(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			if(i%2==1)
			{
			System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		printrange(1,10);
	}
}

