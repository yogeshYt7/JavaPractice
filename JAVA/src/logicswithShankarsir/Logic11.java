package logicswithShankarsir;

class Sample11
{
	static void printArray(int[] arr)
	{
		
		for(int i=arr.length-1;i>=0;i--)
		{
			double z=area(arr[i]);
			System.out.println(z);
		}
		
	}
	static double area(int r)
	{
		final double pi=3.142;
		double res=pi*r*r;
		return res;
	}
}
public class Logic11 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample11.printArray(arr);
		
	}

}
