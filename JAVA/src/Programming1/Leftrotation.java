package Programming1;

public class Leftrotation {

		public static void main(String[] args) 
				{
					int []arr = {10,20,30,40,50};
					rightrotate(arr,2);
				}
			
		static void rightrotate(int [] arr,int times)
			{
			for (int i = 1;  i<times; i++) 
			{		
				int temp =arr[arr.length-1];
				
			
				for (int  j = arr.length-2; j>=arr.length/2; j--) 
				{
					arr[j+1]=arr[j]; 
				}
				arr[arr.length/2]=temp;
			}	
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
				
			}
			}
		}

