package Arrayassignments;

public class Pgm18 { 
	
	static void sum2digit(int[]abb)
	{ int sum=0;
		for (int i=0;i<abb.length;i++) 
		{
			if(abb[i]>=10&& abb[i]<=99 & abb[i]%2==1 ) {
		       sum=sum+abb[i];
			}  
		}
		System.out.println(sum);
	} 
	public static void main(String[] args) 
		{
			int []arr= {11,2,53,4,25};
			sum2digit(arr);
		}	
}

