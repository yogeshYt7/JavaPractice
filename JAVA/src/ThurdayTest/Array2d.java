package ThurdayTest;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int k=7;
		for (int row = 0; row< arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if(arr[row][col]==k)
				System.out.print(k+" is present in "+row+" row and "+col+" column. ");
			}
			System.out.println();
		}
	}

}
