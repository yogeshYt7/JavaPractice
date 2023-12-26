package STRINGPGMS;

public class pgm3 {

	public static void main(String[] args) {
        
		String str="knowledge";
		String s=str.substring(0,4);
		String s1=str.substring(0,4);
		String reverse="";
		String rev="";
		
		for(int i=str.length()/3;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		for (int i = s1.length()-1; i >=0; i--) {
			 reverse=reverse+s.charAt(i);
			
		}
		System.out.println(rev+str.substring(4));
		System.out.print(reverse+str.substring(4));

	}

}
