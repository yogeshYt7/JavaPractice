package Programming;

public class Rstring {
	static void charpointing(String a,int no) 
	{ 
		for (int i = 0; i < a.length(); i++) 
		{
			char ch= a.charAt(i);
			System.out.print((char)(ch+4));
		}
		
	}
	public static void main(String[] args) {
		String str="hello";
		int no=4;
		charpointing(str,no);
				
		
		
	}
}
