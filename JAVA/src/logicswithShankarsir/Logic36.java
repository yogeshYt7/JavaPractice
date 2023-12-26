package logicswithShankarsir;

class Sample36
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
		double res=b*h;
		return res;
	}
}
public class Logic36 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int[] abb={2,3,7,9,6};
		Sample36.printArray(arr,abb);
		
	}

}