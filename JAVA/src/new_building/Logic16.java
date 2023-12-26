package new_building;

class Sample
{
	static int countingChar(String s1,char search)
	{
		int charcount=0;
		char[] arr=s1.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(search==arr[i])
				{
					charcount++;
				}
		}
		return charcount;
	}
	static void reverseSentence(String s1)
	{
		int wordCount=0;
		char[] abb=s1.toCharArray();
		String[] arr=new String[countingChar(s1,' ')+1];
		String rev="";
		for(int i=0;i<abb.length;i++)
		{
			if(abb[i]!=' ')
			{
				rev=rev+abb[i];
			}
			else
			{
				arr[wordCount]=rev;
					rev="";
					wordCount++;
				}
			}
		arr[wordCount]=rev;
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

public class Logic16 {
	public static void main(String[] args) {
		
		Sample.reverseSentence("hello java how are you");
		
	}

}
