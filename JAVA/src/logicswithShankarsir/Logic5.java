package logicswithShankarsir;

class Sample5
{
	static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}
	}
}
public class Logic5 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample5.printArray(arr);
	}

}
