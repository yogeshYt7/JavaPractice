package logicswithShankarsir;

class Sampled
{
	static void printArray(int[] arr,int[] abb)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			
			{
				double z=area(arr[i],abb[i]);
				System.out.println(z);
				
			}
		}
	}
		static double area(int a,int b)
	{
		final double pi=3.142;
		double res=pi*a*b;
		return res;
	}
}
public class Ellipse1 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int[] abb={2,3,7,9,6};
		Sampled.printArray(arr,abb);
		
	}

}

