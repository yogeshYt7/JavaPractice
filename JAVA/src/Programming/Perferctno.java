package Programming;
import java.util.Scanner;
public class Perferctno {
	public static void main(String[] args) {
				Scanner k= new Scanner(System.in);
				System.out.println("enter a value");
				int no= k.nextInt();
				int sum=0;
				for (int i = 0; i <=no/2; i++) {
					if(i%no==0)
					{
						sum+=i;
					}
					if(no==sum)
					{
					System.out.println(no +"is a perfect number");
					}
					else
					{
						System.out.println(no +"is not a perfect number");
					}break;
				}
	}
}
