
import java.util.*;
public class Logic21 {
	static int add(int no)
	{
		int count=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==1)
			{
				count++;
			}
				no=no/10;
			
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value:");
		int a=sc.nextInt();
		int b=add(a);
		System.out.println(b);
	}
}
