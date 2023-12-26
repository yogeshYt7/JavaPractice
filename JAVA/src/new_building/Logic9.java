package new_building;

import java.util.Scanner;

public class Logic9 {public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=s.nextInt();
	short[] arr=new short[size];
	System.out.println("Enter array values:");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextShort();
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}


