package new_building;

import java.util.Scanner;

public class Logic11 {
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=s.nextInt();
	byte[] arr=new byte[size];
	System.out.println("Enter array values:");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextByte();
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}


