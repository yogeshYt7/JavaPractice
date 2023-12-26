package Programming;

import java.util.Scanner;
import java.util.TreeSet;



	import java.util.Scanner;
	import java.util.TreeSet;

	public class Switchcase3 {
	    public static void main(String[] args) {
	        System.out.println("Enter value");
	        Scanner k = new Scanner(System.in);
	        int input = k.nextInt();
	        switch (input) {
	            case 1:
	                ArmStrongnumber();
	                break;
	            case 2:
	                PerfectNumber();
	                break;
	            case 3:
	                Panagram();
	                break;
	            case 4:
	                Vowel();
	                break;
	            default:
	                System.out.println("Invalid input");
	                break;
	        }
	    }

	    public static void Vowel() {
	        System.out.println("Enter value");
	        Scanner k = new Scanner(System.in);
	        char ch = k.next().charAt(0);
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            System.out.println("Vowel");
	        } else {
	            System.out.println("Not a vowel");
	        }
	    }

	    public static void Panagram() 
	    {
	        String str = "The quick brown fox jumps over the lazy dog";
	        str = str.toLowerCase();
	        TreeSet<Character> t = new TreeSet<>();
	        for (int i = 0; i < str.length(); i++) {
	            t.add(str.charAt(i));
	        }
	        if (t.size() == 26) {
	            System.out.println("PANAGRAM");
	        }
	    }

	    public static void PerfectNumber() {
	        int sum = 0;
	        int no = 28;
	        for (int i = 1; i <= no / 2; i++) {
	            if (no % i == 0) {
	                sum += i;
	            }
	        }
	        if (no == sum) {
	            System.out.println(no + " is a perfect number");
	        } else {
	            System.out.println(no + " is not a perfect number");
	        }
	    }

	    public static void ArmStrongnumber() {
	        int num = 153;
	        int sum = 0;
	        int num1 = num;
	        int copy = num;
	        int count = 0;
	        while (num1 != 0) {
	            num1 = num1 / 10;
	            count++;
	        }
	        while (num != 0) {
	            int rem = num % 10;
	            sum += Math.pow(rem, count);
	            num = num / 10;
	        }
	        if (copy == sum) {
	            System.out.println(copy + " is ArmstrongNumber");
	        }
	    }
	}
