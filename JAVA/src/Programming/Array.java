package Programming;

public class Array {
	 static String revstr(String S)
	 {
		 String rev="";
		 for (int i = S.length()-1;i>=0; i--) {
			 rev=rev+S.charAt(i);
		}
	return rev;
	}
public static void main(String[] args) {
	String [] str={"KEDHARANATH","AMARNATH","BHADRNATH","DAWARAKH","BRINDHAVAN","KASHI"};
	String S1="";
	for (int i = 0; i <str.length; i++) {
		S1=S1+" "+revstr(str[i]);	
	}
System.out.println(S1);
}
}
