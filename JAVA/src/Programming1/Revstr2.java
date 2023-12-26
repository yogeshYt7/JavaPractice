package Programming1;

public class Revstr2 {
	public static void main(String[] args) {
		String Str= "cool,mava ,java,rodaa";
		char k='o';
		char [] ch=Str.toCharArray();
		int count =0;
		for (int i = 0; i < ch.length-1; i++) 
		{
			if (ch[i]==k)
			{
				count++;
			}
			
		}
System.out.println(count);
	}

}
