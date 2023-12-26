package logicswithShankarsir;

class Sample28
{
	static void printArray(int[] arr)
	{
		
		for(int i=arr.length-1;i>=0;i--)
		{
			double z=area(arr[i]);
			System.out.println(z);
		}
		
	}
	static double area(int a)
	{

		double res=a*a;
		return res;
	}
}
public class Logic28 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample28.printArray(arr);
		
	}

}