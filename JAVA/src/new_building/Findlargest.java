package new_building;

import java.util.Arrays;

public class Findlargest {
	public static void main(String[] args) {
		int[] arr={9,7,8,10,1,3,4,5,2,6};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]+" "+arr[arr.length-2]+" "+arr[arr.length-3]);
	}

}
