package logicswithShankarsir;
class Sample3
{
	static void printArray(int[] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
public class Logic3 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample3.printArray(arr);
	}

}