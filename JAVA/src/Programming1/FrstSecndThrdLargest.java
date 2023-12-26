package Programming1;
import java.util.Arrays;
public class FrstSecndThrdLargest {
	public static void main(String[] args) {
	int []arr= {9,7,8,10,4,3,5,2,6,1};
	Arrays.sort(arr);
	System.out.println(arr[arr.length-1]+" "+ arr[arr.length-2]+" "+arr[arr.length-3]);
	}
}