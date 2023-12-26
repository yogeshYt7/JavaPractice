package Programming;

public class revsen3 {
//i/p =hi hello java how are you
	//ih avaj era
	public static void main(String[] args)
	{
	String str="hi hello java how are you";
	String[] S=str.split(" ");
	for(int i=0;i<S.length;i++) 
	{
		if(i%2==0)
		{
			String str2=S[i];
			String reverse=" ";
			for(int j=str2.length()-1;j>=0;j--)
			{
				reverse=reverse+str2.charAt(j);
			}
			
			System.out.print(reverse+" ");
		}
		
	}
	
	
	
	
			}	
	
		
	
	}
	

