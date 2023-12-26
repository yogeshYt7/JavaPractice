package ThurdayTest;

public class Armstrongnumber {
public static void main(String[] args) {
	int n=153;
	int copy=n;
	int n1=n;
	int sum=0;
	int count=0;
	while(n1!=0) {
		n1=n1/10;
		count++;
	}
	while (n!=0) {
		int rem=n%10;
		sum+=Math.pow(rem, count);
		n=n/10;
	}
	if(copy==sum) {
		System.out.println(copy + " is a Armstrong number");
	}
}
}
