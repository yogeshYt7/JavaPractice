package Programming;

public class revsen1 {
//i/p =hi hello java how are you
	//how are you java hello hi 
	public static void main(String[] args) {
		
	
	String str="hi hello java how are you";
	String[] S=str.split(" ");
	
	for(int i=(S.length)/2;i<=S.length-1;i++)
	{
		System.out.print(S[i]+" ");
	}
	for(int j=((S.length)/2)-1;j>=0;j--) 
	{
		System.out.print(S[j]+" ");
	}
}
}