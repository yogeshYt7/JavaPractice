package Programming;
import java.util.Scanner;
public class Mulofeven {





	     static int sumno(int num) {
	  
	    	 int mul=1;
	     while (num!=0) 
	     {     int rem=num%10;

	    	 if (rem%2==0)
	         {
	        mul =mul*rem;
	         }
	    	 num=num/10;
	    	
	     }
	     return mul;
	}
public static void main(String[] args) {
	Scanner S1= new Scanner(System.in);
	System.out.println("enter  value ");
     int X=sumno(S1.nextInt());
     System.out.println(X);
}
}
