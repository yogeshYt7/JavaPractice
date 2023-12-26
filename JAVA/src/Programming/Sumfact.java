package Programming;
import java.util.Scanner;
public class Sumfact{
	static int findfact(int no)
	{ int sum=0;
		while(no!=0) 
		{
			int re=no%10;
			//sum=sum+re;
			no=no/10;
		
		}
		for (int i = no; i >=1; i--) 
		{int fact=1;
			fact=fact*i;
			sum+=fact;
		}
		return sum;
	}
	
public static void main(String[] args) {
	Scanner S= new Scanner(System.in);
	System.out.println("enter  value ");
	 int z= findfact(S.nextInt());
 System.out.println(z);
}
}
