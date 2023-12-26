package Programming;

public class revsen {
//i/p =hi hello java how are you
	//java hello hi how aare you
	public static void main(String[] args) {
		
	
	String str="hi hello java how are you";
	String[] S=str.split(" ");
	
	for(int i=(S.length-1)/2;i>=0;i--)
	{
		System.out.print(S[i]+" ");
	}
	for(int j=(S.length-1)/2;j<S.length-1;j++) 
	{
		System.out.print(S[j]+" ");
	}
}
}