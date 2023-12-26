package mock;

public class removeDuplicates {

	public static void main(String[] args) {
		int[] arr= {4,5,1,3,4,5,7,1,2};
		for (int i = 0; i < arr.length; i++) {
			boolean flag=true;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j] && i!=j) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(arr[i]);
			}
		}
}
}