package logicswithShankarsir;

class Sample32
{
	static void printArray(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
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
public class Logic32{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample32.printArray(arr);
		
	}

}