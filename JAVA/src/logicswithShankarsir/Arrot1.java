package logicswithShankarsir;

import java.util.Scanner;

public class Arrot1 {
	static void arrot(int[] arr,int k)
	{
	
		int n=arr.length;
		k=k%n;
		for(int i=2;i<n;i++)
		{
			if(i<arr.length/2-1){
			System.out.print(arr[i]+" ");
			}
			else if(i<n){
				System.out.print(arr[n+i-k]+" ");
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
		System.out.println("Enter the "+j+" array elements");
		arr[j]=sc.nextInt();
	}
	Arrot1.arrot(arr,k);
}
}


