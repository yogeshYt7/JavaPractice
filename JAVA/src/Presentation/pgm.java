package Presentation;

public class pgm {
	public static void main(String[] args) {
		String S1="banglore";
		String S2 ="karnataka";
		char []arr1=S1.toCharArray();
		char []arr2=S2.toCharArray();
		for (int i = 0; i < arr1.length; i++) 
		{
			if (arr1[i]=='k' || arr1[i]=='t')
			{
				System.out.println(arr1[i]);
			}
		}
		for (int i = 0; i < arr2.length; i++)
		{
			if (arr2[i]=='k' || arr2[i]=='t') 
			{
				System.out.println(arr2[i]);
//				break;
			}
		}
	}

}
