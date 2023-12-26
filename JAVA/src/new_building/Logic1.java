package new_building;

public class Logic1 {
	public static void main(String[] args) {
		String str="hello";
		int no=4;
		charprint(str,no);
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
