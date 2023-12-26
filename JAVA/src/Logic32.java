
import java.util.*;
public class Logic32 {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
				System.out.println("Enter the no");
		int base=S.nextInt();
		int exp=S.nextInt();
		int Ans=1;
		while(exp!=0)
		{
			Ans=Ans*base;
			exp--;
		}
		System.out.println(Ans);
	}
}
