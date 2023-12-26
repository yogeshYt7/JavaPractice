package new_building;

import java.util.Scanner;

public class Logic13 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		float[] arr=new float[size];
		System.out.println("Enter array values:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextFloat();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
