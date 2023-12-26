package Programming1;
import java.util.Scanner;
public class Calculator {
	    public static void main(String[] args)
	    {
               int num1, num2;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the numbers");
	        num1 = sc.nextInt();
	        num2 = sc.nextInt();
	        System.out.println("Enter the operator (+,-,*,/)");
	        char op = sc.next().charAt(0);
	        int Result = 0;
	 
	        switch (op) {
	        case '+':
	        	 System.out.println(Result = num1 + num2);
	            break;
	        case '-':
	        	 System.out.println(Result = num1 - num2);
	            break;
	        case '*':
	        	 System.out.println(Result = num1 * num2);
	            break;
	        case '/':
	           System.out.println(Result = num1 / num2); 
	            break;
	        default:
	            System.out.println("In valid input");
	        }
	        
	    }
	}