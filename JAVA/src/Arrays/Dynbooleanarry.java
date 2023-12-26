package Arrays;
import java.util.Scanner;
public class Dynbooleanarry {
	public static void main(String[] args) {
		try (Scanner Sc = new Scanner(System.in)) {
			System.out.println("ENTER THE SIZE OF ARRAY");
			int size = Sc.nextInt();
			boolean [] arr = new boolean [size];
			System.out.println("Enter the array elemnts");
			for (int i = 0; i < arr.length; i++) {
				arr[i]=Sc.nextBoolean();			
			}
			System.out.println("The array values are :-");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]+" ");
				
			}
		}
	}

}
