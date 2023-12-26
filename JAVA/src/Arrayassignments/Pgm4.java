package Arrayassignments;

public class Pgm4 {
	static void evenR(int[] abb)
	{  for (int i = abb.length-1; i>=0;i--) 
		{
			if(abb[i]%2==0)
			{
				System.out.print(abb[i]+" ");
			}
		}
		
	}
  public static void main(String[] args) {
	int []arr= {1,2,3,4,5};
	evenR(arr);
}
}
