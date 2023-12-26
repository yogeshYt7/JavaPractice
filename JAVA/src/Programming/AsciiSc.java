package Programming;
import java.util.Scanner;
public class AsciiSc {
	public static void main(String[] args) {
		Scanner K = new Scanner(System.in);
		System.out.println("ENTER VALUE");
		char A = K.next().charAt(0);
		int l= (int)(A+4);
		System.out.println((char)(A+4));
		
	}

}
