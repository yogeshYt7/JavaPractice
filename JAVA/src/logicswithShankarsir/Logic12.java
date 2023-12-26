package logicswithShankarsir;

class Sample12
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
	static double area(int r)
	{
		final double pi=3.142;
		double res=pi*r*r;
		return res;
	}
}
public class Logic12 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample12.printArray(arr);
		
	}

}