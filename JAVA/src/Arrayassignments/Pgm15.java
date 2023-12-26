package Arrayassignments;

public class Pgm15 {
	
	static void sum1digit(int[]abb)
	{ int sum=0;
		for (int i=0;i<abb.length;i++) 
		{
			if(abb[i]>=0&& abb[i]<=9) {
		       sum=sum+abb[i];
			}  
		}
		System.out.println(sum);
	} 
	public static void main(String[] args) 
		{
			int []arr= {12,2,53,4,25};
			sum1digit(arr);
		}	
}
