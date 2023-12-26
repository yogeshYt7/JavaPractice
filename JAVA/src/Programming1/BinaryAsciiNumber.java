package Programming1;
//char  ---> Ascii value -->binary
public class BinaryAsciiNumber {
	public static void main(String[] args) {
		for (int i = 65; i < 122; i++) {
		
		
		int no=i;
		
		String sum="";
		char ch=(char)(i);//DownCasting
		while (no!=0) {
			int rem=no%2;
			sum=rem+sum;
			no=no/2;
		}
	System.out.println(ch+"-->"+i+"-->"+sum);	
	}
	}
}
