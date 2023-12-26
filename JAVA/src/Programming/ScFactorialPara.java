package Programming;
import java.util.Scanner;

public class ScFactorialPara {

	static void findfact(int no)
	{
		int fact=1;
		for (int i = no; i >=1; i--) {
			fact=fact*i;
			
		}
		
		System.out.println(fact);
	}
public static void main(String[] args) {
	Scanner Sc= new Scanner(System.in);
	System.out.println("enter  value ");
 findfact(Sc.nextInt());
}
}
