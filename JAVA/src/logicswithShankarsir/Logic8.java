package logicswithShankarsir;
class Sample9
{
	static void printArray(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
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
public class Logic8 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample9.printArray(arr);
		
	}

}
