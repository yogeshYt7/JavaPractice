package logicswithShankarsir;

class Sample1
{
	static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
public class Logic2 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample1.printArray(arr);
	}

}
