package logicswithShankarsir;

class Sample30
{
	static void printArray(int[] arr)
	{
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]%2==0)
			{
				double z=area(arr[i]);
				System.out.println(z);
			}
	}
		
	}
	static double area(int a)
	{

		double res=a*a;
		return res;
	}
}
public class Logic30 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample30.printArray(arr);
		
	}

}
