package YOGESH;
import java.util.Scanner;
public class Count {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
		System.out.println(" Enter number");
		int no=SC.nextInt();
		int count=0;
		while (no!=0) 
		{
			no=no/10;
			count++;
			
		}
	System.out.println(count);
	}
}
