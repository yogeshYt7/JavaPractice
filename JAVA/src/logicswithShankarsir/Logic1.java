package logicswithShankarsir;

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
		int wordcount=0;
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
				arr[wordcount]=rev;
				rev="";//reset rev for the next word
				wordcount++;//move to the next word index in the arr
			}
		}
		arr[wordcount]=rev;//assign the last word to the arr array
		for(int j=arr.length-1;j>=0;j--)//print the reversed words
		{
			System.out.print(arr[j]+" ");
		}
		
	}
}


public class Logic1 {
	public static void main(String[] args) {
		Sample.reverseSentence("java mava jobaa fixaa");
	}
}
