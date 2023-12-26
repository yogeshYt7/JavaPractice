package STRINGPGMS;

public class ACCENTURE {

	public static void main(String[] args) {
		int sum=0;
		int n=21;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.print(sum);

	boolean flag=true;
	for(int i=2;i<sum;i++) {
		if(sum%i==0) {
			flag=false;
	}
		if(flag) {
			System.out.print(" is googly");
		}else {
			System.out.print(" is not googly");
			break;
		}
	}
	}
}

	

