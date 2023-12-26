package Programming1;

public class FourLetterWordsWithO {
	public static void main(String[] args) {
		int x=countchar();
		System.out.println(x);
		
	}
	static int countchar()
	{
	String Str= "cool,rama ,sita,wow,mom";
	char [] ch=Str.toCharArray();
	int count =0;
	String Str1="";
	for (int i = 0; i < ch.length; i++) 
	{    Str1=Str1+ch[i];
        if (Str1.length()== 4 && Str1.length()=='o') 
        {    
        	  count++;
               break; // Once 'o' is found, no need to check the rest of the characters in the word.
        }
    }

    return count;
	}

}
