
package Programming;

public class Pgm10 {
	static void printrange(int[] abb)
	{
		for(int i=0;i<abb.length;i++)
		{
			System.out.print(abb[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5};
		printrange(arr);
	}
}

