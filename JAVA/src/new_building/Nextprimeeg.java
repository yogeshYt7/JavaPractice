package new_building;

import java.util.Scanner;

public class Nextprimeeg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the prime number:");
		int no=sc.nextInt();
		nextPrime(no);
		
	}
	static void nextPrime(int k)
	{
		for (int i = k+1; i < 1000; i++) {
			int no=i;
			boolean flag=true;
			for (int j = 2; j < no; j++) {
				if(no%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(no+" is a prime number");
				break;
			}
		}
	}

}
