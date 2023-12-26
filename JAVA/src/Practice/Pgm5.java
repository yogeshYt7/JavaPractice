package Practice;

public class Pgm5 {
	public static void main(String[] args) {
		String str="789";
		

		System.out.println(number(str));
		
	}

	
	
	public static  int number(String no)
	{  int i=Integer.parseInt(no);
	      
		int ans=0;
		while (i!=0) 
		{		
			int rem=i%10;
			ans+=rem;
			i=i/10;
		
		}
		return ans;
	}
}
