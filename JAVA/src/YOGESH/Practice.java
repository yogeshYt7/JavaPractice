 package YOGESH;
class Practice{
	static void findsum(int [] arr)
	{
		int sum1=0;
		int sum2=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) 
			{
				System.out.println(arr[i]);
			    sum1+=arr[i];
			}
			
			else {
				System.out.println(" odd number");
				System.out.println(arr[i]);
				sum2+=arr[i];
			}
		}
		 System.out.println("even sum"+sum1);	
		 System.out.println("odd sum"+sum2);	
	}
	
	 	public static void main (String[] args)
	 	{
	 		int [] arr= {1,2,3,4,5,6,7,8,9};
	 		findsum( arr);
	 		
	 	}
}

