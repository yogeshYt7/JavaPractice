package new_building;//ip:"Hello Java" o/p:ello ava HJ

public class Logicpattern {
	public static void main(String[] args) {
		String str="Hello Java";
		String s1="";
		String s2="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>= 'A' && str.charAt(i)<='Z')
			{
				s1+=str.charAt(i);
			}
			else
			{
				s2+=str.charAt(i);
			}
		}
		System.out.println(s2+" "+s1);
	}

}
