package Programming;
import java.util.Scanner;
public class  RstringDy {
	static void charpointing(String a,int no) 
	{ 
		for (int i = 0; i < a.length(); i++) 
		{
			char ch= a.charAt(i);
			System.out.print((char)(ch+4));
		}
		
	}
	public static void main(String[] args) {
		Scanner K= new Scanner(System.in);
		System.out.println("Enter value");
		String str=K.next();
		
		int no=4;
		charpointing(str,no);
				
		
		
	}
}
