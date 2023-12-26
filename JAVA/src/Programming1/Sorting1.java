package Programming1;

public class Sorting1 {
	public static void main(String[] args) {
		int [] arr= {3,8,14,12,10,7,4};
		int sum1=0;
		int sum2=0;
		for (int i = 0; i < arr.length/2; i++)
		{  
			sum1=sum1+arr[i];
			
		}
		
		for (int i = arr.length/2-1; i < arr.length; i++) 
		{
			sum2=sum2+arr[i];	
			
			
		}
		
	System.out.println(sum1*sum2);
	
	}
	

}
