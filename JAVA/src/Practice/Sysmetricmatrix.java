package Practice;

import java.util.Arrays;

public class Sysmetricmatrix {
	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{2,4,5},{6,5,8}};
		int [][]arr2=new int[3][3];
		System.out.println(compare(arr,arr2));
		
//		arr[0][1]=6;
//		if (Arrays.deepEquals(arr,arr2))
//		{
//			System.err.println(" sysmetric");
//		}else
//		{
//			System.out.println("not a sysmetric");
//		}
	}

	private static boolean compare(int[][] arr, int[][] arr2) {
		for (int row = 0; row < arr2.length; row++)
		{
			for (int col = 0; col < arr[row].length; col++)
			{
				arr2[row][col]=arr[row][col];
				if (arr[row][col]==arr2[row][col]) 
				{
//					System.out.println("sysmetric");
//					break;
					return true;
				}
				else {
//					System.out.println(" not  a sysmetric");
					return false;
				}
			}
			System.err.println();
			
		}
		return false;
	}

}
