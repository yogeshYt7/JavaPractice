package YOGESH;
import java.util.Scanner;

public class Strongnumber {
	
public static void main(String[] args) {
	Scanner K=new Scanner(System.in);
	System.out.print("enter numer");
		int num = K.nextInt();
		int sum =0;
		int copy=num;
		while(num!=0) 
		  {
			int d = num%10;
			sum =sum+fact(d);// calling fact method  and passing d as arguments 
			num = num/10;
			
		  }
		if (sum == copy) 
			
				System.out.print(copy +" is strong numer");
				
		else 
		
			System.out.print(copy +" is not strong numer");
 }
	static int fact(int no)
	{	int fact=1;
			for (int i = no; i>=1; i--) 
			{
					fact=fact*i;
			}
			return fact;
			
	}
	
}
