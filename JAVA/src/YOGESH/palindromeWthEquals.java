package YOGESH;

import java.util.Scanner;

public class palindromeWthEquals {
    public static void main(String[] args) {
    	Scanner Sc= new Scanner(System.in);
    	System.out.println("Enter the  string ");
        String str = Sc.next(); 

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) 
    {
            int left = 0;
            int right = str.length() - 1;

        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

