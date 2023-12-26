package Programming;
import java.util.Scanner;
public class Scsumofno {
	     static int sumno(int num) {
	  
	    	 int sum=0;
	     while (num!=0) 
	     {     int a=num%10;

	    	 if (a%2==0)
	         {
	        sum =sum+a;
	         }
	    	 num=num/10;
	    	
	     }
	     return sum;
	}
public static void main(String[] args) {
	Scanner S1= new Scanner(System.in);
	System.out.println("enter  value ");
     int X=sumno(S1.nextInt());
     System.out.println(X);
}
}