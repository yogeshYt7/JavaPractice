package new_building;

import java.util.Scanner;

public class Logic15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		boolean[] arr=new boolean[size];
		System.out.println("Enter array values:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextBoolean();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
