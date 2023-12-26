package new_building;

import java.util.Arrays;

public class Solution1 {
	public int result(int[] arr,int key)
	{
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("The value is in "+i+" index");
				return 1;
			}
			
		}
		System.out.println("The value is not present");
		return 0;
		
		}
		
	
	public static void main(String[] args) {
		int[] arr1={4,5,1,3,2};
		int key1=1;
		int[] arr2={1,2,3,4,5,6};
		int key2=7;
		
		Solution1 s1=new Solution1();
		s1.result(arr1,key1);
		s1.result(arr2,key2);
	}

}
