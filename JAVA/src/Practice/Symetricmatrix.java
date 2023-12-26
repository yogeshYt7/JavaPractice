package Practice;

public class Symetricmatrix {
	public static void main(String[] args) {
		int [][] matrx= {{1,2,3},{2,4,5},{3,5,8}};
		System.err.println(compare(matrx));
		
	}

	private static boolean compare(int[][] matrx) {
		int row=matrx.length;
		int col=matrx[0].length;
		if (row!=col) 
		{
			return false;
		}
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) {
				if (matrx[i][i]!=matrx[j][i]) 
				{
					return false;
				}
				
			}
		}
		return true;
	}

}
