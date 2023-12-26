package Programming1;

public class RightRotate2 {
	
	public static void main(String[] args) 
			{
				int []arr = {10,20,30,40,50};
				rightrotate(arr,2);
			}
		
	static void rightrotate(int [] arr,int times)
		{
		for (int i = 1;  i<times; i++) 
		{		
			int temp =arr[0];
			
		
			for (int  j = 0; j<=arr.length/2; j++) 
			{
				arr[j]=arr[j+1]; 
			}
			arr[arr.length/2]=temp;
		}	
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		}
	}

