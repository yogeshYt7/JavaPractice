package mock;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153;
		int n1=n;
		int copy=n;
		int sum=0;
		int count=0;
		while(n1!=0) {
			n1=n1/10;
			count++;
		}
		while(n!=0) {
			int rem=n%10;
			 sum+=Math.pow(rem, count);
			 n=n/10;
		}
		if(sum==copy) {
			System.out.println(sum+" is a Armstrong number");
		}else
		{
			System.out.println(sum+"is  not a Armstrong number");	
		}
	}

}
