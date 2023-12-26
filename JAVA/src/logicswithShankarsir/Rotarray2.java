package logicswithShankarsir;

import java.util.Scanner;

public class Rotarray2 {
	static void arrot(int[] arr,int k)
	{
	
		int n=arr.length;
		k=k%n;
		for(int i=0;i<n;i++)
		{
			if(i<k){
			System.out.print(arr[n+i-k]+" ");
			}
			else{
			System.out.print(arr[i-k]+" ");
			}
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int size=sc.nextInt();
	System.out.println("Enter the no of rotataions required");
	int k=sc.nextInt();
	int[] arr=new int[size];
	for(int j=0;j<size;j++)
	{
		System.out.println("Enter the"+j+"array elements");
		arr[j]=sc.nextInt();
	}
	Rotarray2.arrot(arr,k);
}
}
