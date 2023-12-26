package Programming;

public class RevStrWithoutlength {
	public static void main(String[] args) {
		String str="java is easy ";
		char [] ch=str.toCharArray();
		int size=0;
		String rev="";
		for(char c1:ch) 
		{  if (c1!=' ') 
		   {
			rev+=c1;
		   }else 
		      {
//			   System.out.println(rev);
			      rev="";
		      }
		size++;
		}
//		System.out.print(size);
		for (int i = 0; i < ch.length; i++) {
			
		}
		revString(ch,size);
	}

	private static void revString( char []ch ,int size) 
	{   	
		if (size>0)
		{
			System.out.print(ch[size-1]);
			size--;
			revString(ch,size);
		}
	}

}
