package Programming1;
//input:-   hello java how are you
//output:- you are how java hello:
public class RevstringWithoutBfunction {
	public static void main(String[] args) {
	String  str= " hello java how are you";
	char [] ch=str.toCharArray();
	String [] arr= new String[23];
	String  S1=" ";
	int j=0;
	for (int i = 0; i < arr.length; i++) 
	{
		if (ch[i]!= ' ')
		   {
			S1=S1+ch[i];
		   }
		else 
			{ 
				arr[j]=S1;
				S1="";
				j++;
			}
	}
	arr[j]=S1;
		for (int k= arr.length-1;k>=0; k--) 
		{
			System.out.print(arr[k] + " ");
		}
	}
}

