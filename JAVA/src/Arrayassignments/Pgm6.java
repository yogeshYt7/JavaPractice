package Arrayassignments;

public class Pgm6 {
	
	static void sum1(int[]abb)
	{ int sum=0;
		for (int i=0;i<abb.length;i++) 
		{
		       sum=sum+abb[i];
		        
		}
		System.out.println(sum);
	} 
	public static void main(String[] args) 
		{
			int []arr= {1,2,3,4,5};
			sum1(arr);
		}	
}
