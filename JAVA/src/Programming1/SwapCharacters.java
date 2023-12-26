package Programming1;
// input =java is easy
// output= 
public class SwapCharacters 
{
 public static void main(String[] args)
	{
		String str="java is easy";
		char[] ch=str.toCharArray();
		      for(int i = 0; i < ch.length; i++) 
				{
					int k=i;
					while (i<ch.length && ch[i]!=' ') // because we don't know where we give space
					{
						i++;
					}
					char temp=ch[k];//j
					ch[k]= ch[i-1];//a
					ch[i-1]=temp;
				}
	System.out.println(ch);
	}
}
