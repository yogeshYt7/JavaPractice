package ThurdayTest;

public class reverseWithout {
	public  static void main(String[] args) {
		  String s1="hi how are you";
		  String[] s2=new String[s1.length()];
		  for (int i =s1.length()-1;i>=0; i--) {
			if(s1.charAt(i)!=' ') {
				s2[i]=s1;
			}else {
				s2[i]=s1;		
			}
			  System.out.println(s2);
		}
	}
}
