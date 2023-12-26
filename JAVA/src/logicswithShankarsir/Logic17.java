package logicswithShankarsir;

class Sample17
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
		static double area(int b,int h)
	{
		double res=1/2.0*b*h;
		return res;
	}
}
public class Logic17 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int[] abb={2,3,7,9,6};
		Sample17.printArray(arr,abb);
		
	}

}
