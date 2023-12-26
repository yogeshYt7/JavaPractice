package YOGESH;

import java.util.Scanner;

public class Sample {
 public static void main(String[] args) {
	 Scanner K=new Scanner(System.in);
		System.out.print("enter numer");
			int num = K.nextInt();
			int isum =0;
			int asum =0;
			int copy=num;
			while (num!=0) {
				if((num==copy)||(num<10))
				{
					break;
				}
				else 
				{
					isum=isum+num%10;
					num=num/10;
				}
			System.out.println(isum);	
			}
	
}

}
