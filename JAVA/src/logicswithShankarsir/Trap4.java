package logicswithShankarsir;

class Samplea
{
	static void printArray(int[] arr,int[] abb,int[] acc)
	{
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]%2==0 && abb[i]%2==0 && acc[i]%2==0)
			{
				double z=area(arr[i],abb[i],acc[i]);
				System.out.println(z);
				
			}
		}
	}
		static double area(int a,int b,int h)
	{
		double res=1/2.0*(a+b)*h;
		return res;
	}
}
public class Trap4 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int[] abb={2,3,7,9,6};
		int[] acc={5,8,6,3,4};
		Samplea.printArray(arr,abb,acc);
		
	}

}