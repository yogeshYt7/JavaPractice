package Programming1;

public class RangeOfBinary {
	public static void main(String[] args) {
		for (int i = 1; i <122 ; i++) 
		{
			int no=i;
			String sum="";
		while (no!=0) {
			int rem=no%2;
			sum=rem+sum;
			no=no/2;
		}
	System.out.println(i+"-->"+sum);	
	}
	}
}
