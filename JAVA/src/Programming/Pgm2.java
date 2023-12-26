package Programming;

public class Pgm2 {
	static void printrange(int a,int b)
	{
		for(int i=a;i>=b;i--)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		printrange(10,1);
	}
}

