package logicswithShankarsir;
import java.util.Scanner;

public class Arrot2 {
	static void rot(int[]arr, int tm)
	{
		for(int j=1;j<=tm;j++)
		{
			int temp=arr[arr.length-1];
			
			for(int i=arr.length-2;i>=1;i--)
			{
				arr[i+1]=arr[i];
			}
			arr[2]=temp;
		}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter the no of rotations:");
		int tm=sc.nextInt();
		for(int k=0;k<arr.length;k++)
		{
			System.out.println("Enter the "+k+" element of array:");
			arr[k]=sc.nextInt();
		}
		
		rot(arr,tm);
	}
}
	


