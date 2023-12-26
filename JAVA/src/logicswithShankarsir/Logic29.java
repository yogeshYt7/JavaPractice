package logicswithShankarsir;

class Sample29
{
	static void printArray(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
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
public class Logic29 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample29.printArray(arr);
		
	}

}
