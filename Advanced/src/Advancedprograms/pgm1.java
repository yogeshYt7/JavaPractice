package Advancedprograms;

import java.util.Scanner;

public class pgm1 {
	static int sum = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.err.println("enter number");
		int no = sc.nextInt();
		while (no != 0) {
			int rem = no % 10;
			if (rem % 2 == 0) {  
				sum+=fact(rem);
			} else {
				sum+=square(rem);
			}
			no = no / 10;
		}
		System.out.println(sum);
	}

	 static int fact(int rem) {
		int fact = 1;
		for (int i = rem; i > rem; i--) {
		fact *= i;
		}
		return fact;

	}

	static int square(int rem) {
		int res=rem*rem;

		return res;

	}

}
