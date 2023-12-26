package Arrayassignments;

public class Pgm9 {
	static void primesum(int []abb)
	{ int count=0;
		for (int i = 0; i <=abb.length; i++) 
		{
			if(abb[i]%i==0)
			{
				count =count+abb[i];
			}
		}
			System.out.println(count);
	}

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		primesum(arr);
	}
}
