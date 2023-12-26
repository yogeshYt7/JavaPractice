package Programming;

public class Pgm7 {
	static void printrange(int[] abb)
	{
		for(int i=abb.length-1;i>=0;i--)
		{
			System.out.print(abb[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5};
		printrange(arr);
	}
}

