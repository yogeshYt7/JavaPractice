
package ASSIGNMENTS;

public class Rstr3{

public static void main(String[] args) {
	
	String str="hi hello java how are you";
	String[] S= str.split(" ");
	for (int i=0; i<=S.length-1; i++) 
	{  
		if(i<3) 
		{
			for (int i1=i; i1>=0;i1--);
			{
			System.out.print( S[i]+" ");
			}	
		}
		else   
		{  
			System.out.print( S[i]+" ");
		}

		}
		
	}

}
