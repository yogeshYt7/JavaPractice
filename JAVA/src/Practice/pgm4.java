package Practice;

import Arrays.Array;

public class pgm4 {
	public static void main(String[] args) {
		int [] arr= {8,4,6,5,2,1};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length-1-i; j++) 
			{   if (arr[j]>arr[j+1])
				{
				   int temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
				} 
					
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
