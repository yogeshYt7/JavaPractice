package Programming;
import java.util.Scanner;
public class Expo {
	public static void main(String[] args) {
		Scanner K = new Scanner(System.in);
		System.out.println("Enter value");
		int base =K.nextInt();
		int exp=K.nextInt();
		int ans=1;
		while (exp!=0) 
		{
			ans = ans*base;
			exp--;
			
		}
			System.out.println(ans);
	}

}
