package factorial;

public class Logic6 {
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
			if(arr[i]%2==1)
			{
				sum=sum+findFact(arr[i]);
				break;
			}
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		int[] arr={1,21,3,4,5,8,1};
		findsumofarray(arr);
	}
}
