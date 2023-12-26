package Programming1;

public class ArmStrongNumber {
	public static void main(String[] args) {
		//for (int i = 1001; i < 2000; i++)/// Armstrong nos from range 1001 to 2000//
		
		int no =153;
		int no1=no;
		int copy=no;
		int count =0;
		int sum=0;
		while(no1!=0)
		{
			no1=no1/10;
			count++;
		}
		while(no!=0) 
		{
			int rem =no%10;
			sum+=Math.pow(rem,count);
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.println(sum +"is armstrong number");
		}
	} 
	}

  
