package factorial;

public class Logic13 {
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
			if(arr[i]>0 && arr[i]<9)
			{
				sum=sum+findFact(arr[i])*findFact(arr[i])*findFact(arr[i]);
				
			}
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		int[] arr={3,4,5,8,10};
		findsumofarray(arr);
	}
}
