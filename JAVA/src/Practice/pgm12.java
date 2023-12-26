package Practice;
//reverse a strting without using inbuilt  use only Charat and for loop
public class pgm12 {
	public static void main(String[] args) {
		String str =" hi how are you";
		String rev="";
		String []arr = new String[str.length()];
		for (int i=str.length()-1; i>=0; i--) 
		{			
			if (str.charAt(i)==' ') 
			{
				rev+=str.substring(i);
				str=str.substring(0,i);
			}
			
		}
		System.out.println(rev);
		System.out.println(" "+str);
		
	}

}
