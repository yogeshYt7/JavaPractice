package Programming;


public class mainclass {
	static int power(int y,int count1) {
		int x=1;
		while(count1!=0) {
			x=x*y;
			y--;
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		int no=153;
		int no1=no;
		int sum=0;
		int count=0;
		while(no!=0) {
			
			count++;
			no=no/10;
			
		}
	
		
		while(no1!=0) {
			int rem1=no1%10;
			sum=sum+power(rem1,count);
			no1=no1/10;

		}
	if (sum==no)
		System.out.println(sum+"is amstrong");
		}
	}
																																				


