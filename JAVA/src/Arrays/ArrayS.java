package Arrays;

public class ArrayS {

		public static void main(String[] args) {
			String [][]arr= {{"YOGESH","UMESH","UDAY"},{"YASH","RANJITH","ANAD"},{"ABHII","REKHA","DHANA"}};
			for (int row = 0; row < arr.length; row++) 
			{
				for (int col = 0; col < arr[row].length; col++)
				{ 
					if (arr[row][col]== "UDAY")
				{
					System.out.println(arr[row][col] +" is in "+row +"row "+col+"col");
				
					System.out.println( "In "+row +"row "+col+"col " + arr[row][col]+" is there");
					
				}
					
				}
				
			}
		}

	}
