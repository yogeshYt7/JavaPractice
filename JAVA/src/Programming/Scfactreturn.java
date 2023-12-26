package Programming;
import java.util.Scanner;
public class Scfactreturn {
	static int findfact(int no)
	{
		int fact=1;
		for (int i = no; i >=1; i--) {
			fact=fact*i;	
		}
		return fact;
	}
public static void main(String[] args) {
	Scanner S= new Scanner(System.in);
	System.out.println("enter  value ");
	 int z= findfact(S.nextInt());
 System.out.println(z);
}
}
