package Testquestions;

public class Qus4 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int k=3;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(i<k)
			{
				System.out.print(arr[n+i-k]+" ");
			}
			else
			{
				System.out.print(arr[i-k]+" ");
			}
		}
	}

}
