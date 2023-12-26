package Programming1;

public class FrstSecndThrdLargestBubblesort {
	public static void main(String[] args) {
		int []arr= {9,7,8,4,3,5,2,6,10,1};
		for (int i = 0; i < arr.length; i++)// Iterations
		{
			for (int j = 0; j < arr.length-1-i; j++)// Traversal
			{
				if (arr[j]>arr[j+1]) 
				{
					int temp=arr[j];   //Swapping
					arr[j]=arr[j+1];   //Swapping
					arr[j+1]=temp;     //Swapping
					
				}
			}
		}
		System.out.println(arr[arr.length-1]+" "+ arr[arr.length-2]+" "+arr[arr.length-3]);
	
	}

}
