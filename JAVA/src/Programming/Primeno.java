package Programming;
import java.util.Scanner;
public class Primeno {

	public static void main(String[] args) {
		try (Scanner K = new Scanner(System.in)) {
			System.out.println("enter values");
			int a=K.nextInt();
				int no=a+1;//next prime no of give number(a+1)
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

