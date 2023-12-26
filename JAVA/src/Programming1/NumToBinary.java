package Programming1;
//conversion number to binary
public class NumToBinary {
	public static void main(String[] args) {
		int no=100;
		String sum="";
		while (no!=0) {
			int rem=no%2;
			sum=rem+sum;
			no=no/2;
		}
	System.out.println(sum);	
	}

}
