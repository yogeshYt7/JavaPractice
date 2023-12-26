

public class Logic33 {
	
	public static void main(String[] args) {
		for(int no=1;no<=100;no++)
		{
			int sum=0;
			for(int i=1;i<=no/2;i++)
			{
				if(no%i==0)
				{
					sum=sum+i;
				}
			}
			if(no==sum)
			{
				System.out.println(sum);
			}
		}
		
	}

}
