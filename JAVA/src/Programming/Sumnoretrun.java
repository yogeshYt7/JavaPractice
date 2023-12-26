package Programming;

public class Sumnoretrun {

	static int sumNo( int num)
	{ int sum=0;
     while (num!=0) 
     {
    	 int a=num%10;
    	 sum =sum+a;
    	 num=num/10;
    }
     return sum;
	}
	public static void main(String[] args) {
		int X =sumNo(1234);
		System.out.println(X);

	}
}
	
