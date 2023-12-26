

 class Log7 {
	static String check(int no)
	{
		if(no%3==0 && no%7==0)
		{
			return "FizzBuzz";
		}
		else if(no%3==0)
		{
			return "FizzFizz";
		}
		else if(no%7==0)
		{
			return "BuzzBuzz";
		}
		else
		{
			return "Invalid Number";
		}
	}
}
public class Logic7
{
	public static void main(String[] args)
	{
		String x=Log7.check(14);
		System.out.println(x);
	}
}
