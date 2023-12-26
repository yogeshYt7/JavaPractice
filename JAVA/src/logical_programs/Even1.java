package logical_programs;

public class Even1 {
	static void printRange(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			System.out.println(i);
		}
		}

	public static void main(String[] args) {
		printRange(1,10);
		

	}

}
