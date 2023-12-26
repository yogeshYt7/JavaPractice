

public class MDarraysString {
	public static void main(String[] args) {
		String [][]arr= {{"YOGESH","UMESH","UDAY"},{"YASH","RANJITH","ANAD"},{"ABHII","REKHA","DHANA"}};
		for (int row = 0; row < arr.length; row++) 
		{
			for (int col = 0; col < arr[row].length; col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}

}
