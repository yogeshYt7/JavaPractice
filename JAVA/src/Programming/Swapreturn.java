package Programming;
import java.util.Scanner;

public class Swapreturn {


	public static void main(String[] args) {
		Scanner K=new Scanner(System.in);
		System.out.print("enter numer");
			int num = K.nextInt();
		
System.out.println("************************** WITH THIRD VARIABLE*********");
	      	
					int a=20;
					int b=30;
					int c=a;
					a=b;
					b=c;
		      System.out.println("a="+a);
		      System.out.println("b="+b);
		      
 System.out.println("************************** WITHOUT THIRD VARIABLE*********");
		      
           int d=12;
           int e=21;
           d=d+e;
           e=d-e;
           d=d-e;
           System.out.println("e="+e);
           System.out.println("d="+d);
	}
}
