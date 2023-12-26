package Programming1;
	import java.util.Arrays;

	public class Ascending {
	    public static void main(String[] args) {
	        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        int rotations = 3; // Number of positions to rotate the array to the right

	        int[] rotatedArray = rotateArrayRight(inputArray, rotations);

	        // Printing the output
	        System.out.println("Input Array: " + Arrays.toString(inputArray));
	        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
	    }

	    public static int[] rotateArrayRight(int[] arr, int k)
	    {
	        int n = arr.length;
	        k = k % n; // To handle k > n cases

	        // Create a new array to store the rotated elements
	        int[] rotatedArr = new int[n];

	        // Copy the elements from the original array to the rotated array
	        System.arraycopy(arr, n - k, rotatedArr, 0, k);
	        System.arraycopy(arr, 0, rotatedArr, k, n - k);

	        return rotatedArr;
	    }
	}
