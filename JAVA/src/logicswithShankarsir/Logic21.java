package logicswithShankarsir;

class Sample21
{
	static void printArray(int[] arr,int[] abb)
	{
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]%2==1 && arr[i]%2==1)
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
public class Logic21 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int[] abb={2,3,7,9,6};
		Sample21.printArray(arr,abb);
		
	}

}
