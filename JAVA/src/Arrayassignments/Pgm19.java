package Arrayassignments;

public class Pgm19 { 
	
	static void sum2digit(int[]abb)
	{ int sum=0;
		for (int i=0;i<abb.length;i++) 
		{
			if(abb[i]>=0&& abb[i]<=9 & abb[i]%2==1 ) {
		       sum=sum+abb[i];
			}  
		}
		System.out.println(sum);
	} 
	public static void main(String[] args) 
		{
			int []arr= {11,2,3,4,5};
			sum2digit(arr);
		}	
}

