package Programming;

public class revsen2 {
//i/p =hi hello java how are you
	//you are how hi hello java
	public static void main(String[] args) {
		
	
	String str="hi hello java how are you";
	String[] S=str.split(" ");
	
	for(int i=S.length-1;i>=(S.length/2);i--)
	{
		System.out.print(S[i]+" ");
	}
	for(int j=0;j<(S.length/2);j++) 
	{
		System.out.print(S[j]+" ");
	}
}
}