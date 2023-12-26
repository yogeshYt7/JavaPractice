package STRINGPGMS;

public class reverseSplit {

	public static String main(String[] args) {
 
		/*
		String s1="hi how are you";
  String[] s2=s1.split(" ");
  for (int i = s2.length-1;i>=0; i--) {
	System.out.print(s2[i]+" ");
		}
	}
	*/
			  String s1="hi how are you";
			  String[] s2=new String[s1.length()];
			  for (int i =s1.length()-1;i>=0; i--) {
				if(s1.charAt(i)!=' ') {
					s2[i]=s1;
				}
			}
			return s1;
		}

}

