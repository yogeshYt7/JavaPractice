package Programming1;

import java.util.Iterator;

public class MaxFreqncyOfString {

	public static void main(String[] args) {
		String str ="hello";
		int [] arr=new int[122];
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			arr[ch]++;
		}
	 int max=-1;
	 char a=' ';
	 for (int i = 0; i < str.length(); i++)
	 {
		if (arr[i]!=0) 
		{
			if (max<arr[i]) 
			{
				max=arr[i];
				a=str.charAt(i);
			}
		}
	 }
	System.out.println(a+" ->"+ max);
	}
}
