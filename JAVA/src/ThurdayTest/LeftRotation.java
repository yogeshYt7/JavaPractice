package ThurdayTest;

public class LeftRotation {

	public static void main(String[] args) {

		int[]arr= {1,2,3,4,5,6};
		int k=2;
		leftRotate(arr,k);
		
	}

	private static void leftRotate(int[] arr, int k) {
		
		int j=0;
		while(j<k) {
			int temp=arr[0];
			for (int i = 0; i <=arr.length-2; i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
			j++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
