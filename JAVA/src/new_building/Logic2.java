package new_building;
import java.util.*;
public class Logic2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string and no of places to shift:");
		String x=s.nextLine();
		int y=s.nextInt();
		charprint(x,y);
	}
	static void charprint(String a,int b)
	{
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			System.out.print((char) (ch+b));
		}
	}
}

