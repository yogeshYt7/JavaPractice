

public class Logic15 {
	static long swap(long a,long b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		return a;
		
	}
	static long disp(long a,long b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		return b;
	}
	
	public static void main(String[] args) {
		long x=swap(15000,20000);
		long y=disp(15000,20000);
		System.out.println(x);
		System.out.println(y);
	}
		
	

}
