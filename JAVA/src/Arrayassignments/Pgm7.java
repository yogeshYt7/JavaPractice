package Arrayassignments;

public class Pgm7 {
	static void oddsum(int []abb)
	{ int sum=0;
		for (int i = 0; i < abb.length; i++) 
		{
			if(abb[i]%2==1)
			{
				sum+=abb[i];
			}
		}
			System.out.println(sum);
	}

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		oddsum(arr);
	}
}
