package Programming;
import java.util.Scanner;
public class Primenorange {

	public static void main(String[] args) {
		try (Scanner K = new Scanner(System.in)) {
			System.out.println("enter values");
			int a=K.nextInt();
			int b=K.nextInt();
			for(int j=a;j<=b;j++) 
			{
				int no=j;
				boolean flag=true;
				for(int i=2; i<no;i++)
				{
					if(no%i==0)
					{
					flag=false;
					break;
				}
			}

				if(flag==true)
				{
					System.out.println(no +" prime number");
				}
				else
				{
					System.out.println(no +" not a prime number");
				}
}
		}

}
}
