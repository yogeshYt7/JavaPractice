package Programming;


/*
 * input----->java java is easy easy programming language language
 * 
 * output----->java is easy programming language
 * 
 * 
 * 
 * 
 * */
public class Removeconsective {

	public static void main(String[] args) {
		try {
			String str="java java is easy easy programming language language";
			char[] ch=str.toCharArray();
			String s1="";
			String[] s2=new String[10];
			int j=0;
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]!= ' ') {
					s1+=ch[i];
				}else {
					s2[j]=s1;
					j++;
					s1="";
				}
			}
			for (int i = 0; i < s2.length-1; i++) {
				if(!removeconsecutivewords(s2[i],s2[i+1])) {
				System.out.print(s2[i]+" ");
			}
			}
		}catch(Exception e) {
			}	
}
	
	
	 static boolean removeconsecutivewords(String s1, String s2) {
		 if(s1.length()!=s2.length()) {
		 		return false;	 
		 }
		 for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		 }
		 return true;
	}

}