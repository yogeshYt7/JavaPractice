package factorial;

public class Logic1 {
	static int findFact(int no)
	{
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	static void findsumofarray(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			{
				sum=sum+findFact(arr[i]);
			}
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		int[] arr={1,2,3,4,5};
		findsumofarray(arr);

	}

}
