package logicswithShankarsir;

class Sample18
{
	static void printArray(int[] arr,int[] abb)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0 && abb[i]%2==0)
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
public class Logic18{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int[] abb={2,3,7,9,6};
		Sample18.printArray(arr,abb);
		
	}

}
