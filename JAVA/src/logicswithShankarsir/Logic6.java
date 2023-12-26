package logicswithShankarsir;

class Sample6
{
	static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
				System.out.print(arr[i]+" ");
		}
	}
}
public class Logic6 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample6.printArray(arr);
	}

}
