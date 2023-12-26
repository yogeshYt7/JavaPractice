package Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Arraysadd{
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter values m and n");
		int m=Sc.nextInt();
		int n=Sc.nextInt();
		int [] arr1= new int [m+n];
		System.out.println("Enter arr1 values");
		for (int i = 0; i < arr1.length; i++) 
		{
			arr1[i]=Sc.nextInt();
		}
		int [] arr2= new int [n];
		System.out.println("Enter arr2 values");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=Sc.nextInt();
		}
		int []arr3=storedarrays(arr1,arr2,m,n);
		Arrays.sort(arr3);
		for (int i = 0; i < arr3.length; i++) 
		{
			System.out.print(arr3[i]+" ");
		}
	}
	public static int[] storedarrays(int[] arr1, int[] arr2, int m, int n)
	{
		int size=m+n;
		int [] arr4=new int[size];
		int j=0;
		for (int i = 0; i < arr1.length; i++) 
		{	arr4[i]=arr1[i];
			if (arr1[i]==0) 
			{
				arr1[i]=arr2[j];
				arr4[i]=arr1[i];
				j++;
			}
		}
		return arr4;
	}

}
