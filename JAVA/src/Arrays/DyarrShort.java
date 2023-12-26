package Arrays;
import java.util.Scanner;
public class  DyarrShort{
	public static void main(String[] args) {
		try (Scanner Sc = new Scanner(System.in)) {
			System.out.println("ENTER THE SIZE OF ARRAY");
			int size = Sc.nextInt();
			short [] arr = new short [size];
			System.out.println("Enter the array elemnts");
			for (int i = 0; i < arr.length; i++) {
				arr[i]=Sc.nextShort();			
			}
			System.out.println("The array values are :-");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
				
			}
		}
	}

}
