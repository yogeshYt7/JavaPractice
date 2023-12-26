package logicswithShankarsir;
class Sample7
{
	static void printArray(int[] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]%2==1)
				System.out.print(arr[i]+" ");
		}
	}
}
public class Logic7 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		Sample7.printArray(arr);
	}

}