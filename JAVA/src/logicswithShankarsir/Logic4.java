package logicswithShankarsir;

class Sample4
{
	static void printArray(int[] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}
	}
}
public class Logic4 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample4.printArray(arr);
	}

}
