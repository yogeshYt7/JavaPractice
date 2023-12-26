package Arrayassignments;

public class Pgm14 {
	
	static void evencubesum(int []abb)
	{
		int sum=0;
		for (int i = 0; i < abb.length; i++) 
		{ 
			 if(abb[i]%2==0)
			 {
			sum +=abb[i]*abb[i]*abb[i];
			 }
		}
	System.out.println(sum);
	}

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		evencubesum(arr);
	}
}
