package Programming1;

public class pattern {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 5; j >0; j--) 
			{
				if (i<j) 
				{
					System.err.print("*");
				}
				
			}
			System.err.println();
		}
	}

}
