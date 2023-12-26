package Execution;

public class pgm4 {
	static String  reverse(String str)
	{
	String rev="";

for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);

}
return rev;
		
	}
	public static void main(String[] args) {
		String str="java is programming lanaguage";
		String res=reverse(str);
		System.out.println(res);
		
		
		
	}

}