package Practice;

public class Pgm6 {
	public static void main(String[] args) {
		int[]arr={4,5,1,2,3};
		int k=7;
		System.out.println( k+ "  is present in index"+ linear(arr,k));
	}

		public static int linear(int[] arr,int k)
		{
		
		
			for (int i = 0; i < arr.length; i++) 
			{
				if (arr[i]==k)
				{ 
					return i;
				}
			
			}
			System.out.println("not present in an array");
			return 0;
					
		}
		
		
		
	
		
		
	}

