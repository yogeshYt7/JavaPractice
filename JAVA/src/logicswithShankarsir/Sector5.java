package logicswithShankarsir;

class Samplen
{
	static void printArray(int[] arr,double[] abb)
	{
		
		for(int i=0;i<arr.length;i++)
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
public class Sector5 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,6};
		double[] abb={3.0,4.68,5.32,7.91,4.0};
		Samplen.printArray(arr,abb);
		
	}

}