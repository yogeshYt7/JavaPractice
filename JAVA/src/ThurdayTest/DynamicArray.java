package ThurdayTest;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);*/
		
		
		System.out.println("ENTER THE SIZE OF ARRAY");
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();			
		}
		even(arr);
		
		}

	 static void even(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i] +" "+ factorial(arr[i]));
				
			}
		}
	}

	 static int factorial(int n) {
		int fact=1;
		for (int i=n;i>0;i--) {
			fact*=i;
		}
		return fact;
	}
	 
	

	}

