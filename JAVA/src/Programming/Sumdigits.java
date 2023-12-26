package Programming;


public class Sumdigits {

	public static int firstDigit(int n)
	{
		while (n >= 10)
		{
			n /= 10;
		}
		return n;
	}
	public static int lastDigit(int n)
	{
		return (n % 10);//4
	}
	public static void main(String argc[])
	{
		int n = 151516365;
		int x=firstDigit(n) + 
				+ lastDigit(n);
		System.out.println(x);
		
		
	}
}

