package Programming1;

public class Sample1 {
	
	static void printArray1(int[]arr,int[] arr1)
	{  for (int i = 0; i < arr.length; i++) 
	   {
		for (int j = 0; j < arr1.length; j++) {
		
		area(arr[i],arr[j]);
	   }
	   }
	}
	
	static void area(int a,int b)
	{ 
		double res = 0.5*a*b; 
		System.out.print(res +"  " );
	}
	
	
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5};
		int[]arr1= {2,2,3,4,5};
		printArray1(arr,arr1);
		
	}

}
