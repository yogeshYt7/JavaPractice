package Arrayassignments;

public class Pgm11 {
	static void cubesum(int []abb)
	{
		int sum=0;
		for (int i = 0; i < abb.length; i++) {
			 
			sum +=abb[i]*abb[i]*abb[i];
		}
	System.out.println(sum);
	}

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		cubesum(arr);
	}
}
