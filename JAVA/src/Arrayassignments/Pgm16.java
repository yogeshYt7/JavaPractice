package Arrayassignments;

public class Pgm16 {
	
	static void sum2digit(int[]abb)
	{ int sum=0;
		for (int i=0;i<abb.length;i++) 
		{
			if(abb[i]>=10&& abb[i]<=99) {
		       sum=sum+abb[i];
			}  
		}
		System.out.println(sum);
	} 
	public static void main(String[] args) 
		{
			int []arr= {12,2,53,4,25};
			sum2digit(arr);
		}	
}
