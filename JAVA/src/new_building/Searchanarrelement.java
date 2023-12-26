package new_building;
import java.util.Scanner;
public class Searchanarrelement {
	public static void main(String[] args) {
		int[] arr={4,1,3,5,2,8,6,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int k=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(k==arr[i])
			{
				System.out.println(k+" is present in "+i+"th index");
			}
		}
	}
}
