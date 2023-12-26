package logicswithShankarsir;

class Sampleo
{
	static void printArray(int[] arr,double[] abb)
	{
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]%2==1 && abb[i]%2==1)
			{
				double z=area(arr[i],abb[i]);
				System.out.println(z);
				
			}
		}
	}
		static double area(int r,double deg)
	{
		double res=1/2.0*r*r*deg;
		return res;
	}
}
public class Sector6 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,6};
		double[] abb={3.0,4.68,5.32,7.91,4.0};
		Sampleo.printArray(arr,abb);
		
	}

}
