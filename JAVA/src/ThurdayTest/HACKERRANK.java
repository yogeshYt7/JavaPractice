package ThurdayTest;


//find smallest missing number


public class HACKERRANK {

	public static void main(String[] args) {
		int[] arr= {3,4,-1,1};
		int size=arr.length;
		int res=missingnum(arr,size);
		System.out.println(res);
	}
	static int missingnum(int[] arr,int n) {
		for (int i = 1; i < n; i++) {
		if(search(arr,i)==false) {
			return i;
		}
		}
		return n+1;
	}
	static boolean search(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==value) {
				return true;
			}
		}
		return false;
	}
}
