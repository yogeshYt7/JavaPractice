package logicswithShankarsir;

class Sample31
{
	static void printArray(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
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
public class Logic31{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample31.printArray(arr);
		
	}

}