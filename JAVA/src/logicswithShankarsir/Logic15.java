package logicswithShankarsir;

class Sample15
{
	static void printArray(int[] arr)
	{
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]%2==1)
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
public class Logic15 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample15.printArray(arr);
		
	}

}
