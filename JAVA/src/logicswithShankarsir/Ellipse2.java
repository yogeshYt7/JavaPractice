package logicswithShankarsir;

class Samplee
{
	static void printArray(int[] arr,int[] abb)
	{
		
		for(int i=arr.length-1;i>=0;i--)
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
public class Ellipse2 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int[] abb={2,3,7,9,6};
		Samplee.printArray(arr,abb);
		
	}

}