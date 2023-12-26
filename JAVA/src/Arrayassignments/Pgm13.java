package Arrayassignments;

public class Pgm13 {

	static void squareoddsum(int []abb)
	{
		int sum=0;
		for (int i = 0; i < abb.length; i++) {
			 if (abb[i]%2==1) {
				
		
			sum =sum+abb[i]*abb[i];
			 }
		}
	System.out.println(sum);
	}

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		squareoddsum(arr);
	}
}
