package Arrays;
import java.util.Scanner;
public class DynArray {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int size = Sc.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter the array elemnts");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Sc.nextInt();			
		}
		System.out.println("The array values are :-");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
