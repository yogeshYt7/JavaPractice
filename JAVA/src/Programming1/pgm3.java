
package Programming1;

public class pgm3 {
	public static void main(String[] args) {
		int[]arr= {1,1,1,1,1,1};
		int n=arr.length-1;
		arraysum(arr,n);
	}

	private static int[] arraysum(int[] arr, int n)
	{
		System.out.print(arr[0]+" ");
		for (int i = 0; i <n; i++) 
		{
			arr[i+1]=arr[i+1]+i+1;
			System.out.print(arr[i+1]+" ");
		}
		return arr; 
		
	
	}

	

}
