
package Programming;
import java.util.Scanner;
public class Countodd {





	     static int sumno(int num) {
	  
	    	 int count=0;
	     while (num!=0) 
	     {     int rem=num%10;

	    	 if (rem%2==1)
	         {
	        count =count+1;
	         }
	    	 num=num/10;
	    	
	     }
	     return count;
	}
public static void main(String[] args) {
	Scanner S1= new Scanner(System.in);
	System.out.println("enter  value ");
     int X=sumno(S1.nextInt());
     System.out.println(X);
}
}
