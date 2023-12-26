package ASSIGNMENTS;

public class Summiddigts {
	public static void main(String[] args) {
		 int num=8251545;
		 System.out.println(mid(num));
	}
	static int mid(int no){
		int copy=no;
		int sum=0;
		while(no!=0)	{
			if((no==copy)||(no<10))
			{
				//sum=no%10;
			}
			else
			{
				sum=sum+no%10;
			}
	        no=no/10;
		}
		return sum;
	}
}


