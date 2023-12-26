package ASSIGNMENTS;

public class Rstr2{
public static void main(String[] args) {
	
	String str="hi hello java how are you";
	String[] S= str.split(" ");
	for (int  i =0;i<=S.length-1;  i++) 
	{  
		if(i<=2) 
		{
		System.out.print( S[i]+" ");
		}
		else 
		{  
			for (int j = S.length-1;j>=3;j--) 
			{
						
				System.out.print( S[j]+" ");
			}
	break;
		}
		
	}
}
}
