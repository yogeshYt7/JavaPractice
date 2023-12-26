package YOGESH;

public class Fibonacci {
public static void main(String[] args) {
	int n=10;
	int f1=0;
	int f2=1;
	int sum=0;
	System.out.print(f1+" "+f2+" ");
	for (int i = 0; i <= n-2; i++) {
		
		sum=f1+f2;
		f1=f2;
		f2=sum;
		System.out.print(sum+" ");
	}
}
}
