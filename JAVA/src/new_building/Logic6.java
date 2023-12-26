package new_building;

import java.util.*;

 
public class Logic6 {
	void fetch(String str )
	{
		
		String[] s1=str.split(" ");
		String k="java";
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals(k))
			{
				count++;
			}
		}
		System.out.println(k+"->"+count);
	}
	public static void main(String[] args) {
		Logic6 l1=new Logic6();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String ab=s.nextLine();
		l1.fetch(ab);
		
	}

}
