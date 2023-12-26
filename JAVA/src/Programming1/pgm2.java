package Programming1;

public class pgm2 {
	public static void main(String[] args) {
		int[]arr={1,1,1,1,1};
		arraysum(arr,arr.length);
	
	}

	private static void arraysum(int[] arr, int n) {
		System.out.print(arr[0]+" ");
		for (int i = 0; i < n-1; i++)
		{
			arr[i+1]+=arr[i];
			System.out.print(arr[i+1]+" ");
			
			
		}

	}

}
