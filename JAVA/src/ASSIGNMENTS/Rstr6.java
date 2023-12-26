package ASSIGNMENTS;

public class Rstr6 {
public static void main(String[] args) {
	String str="hi hello java how are you";
	String[] S= str.split(" ");
	for (int i = 0; i < S.length-1; i++) 
	{
		if(i%2==1)
		{
		System.out.print( S[i]+" ");
		}
	}
			
}
}
