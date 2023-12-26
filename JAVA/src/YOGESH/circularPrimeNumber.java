package YOGESH;

import java.util.ArrayList;

public class circularPrimeNumber {

    public static void main(String[] args) {
        int number = 11931;

        if (isCircularPrime(number)) {
            System.out.println(number + " is a circular prime.");
        } else {
            System.out.println(number + " is not a circular prime.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to rotate the digits of a number
    public static int rotateNumber(int n) {
        int num = n;
        int numDigits = (int) Math.log10(n) + 1;
        int pow = (int) Math.pow(10, numDigits - 1);
        int firstDigit = num / pow;
        num = (num % pow) * 10 + firstDigit;
        return num;
    }

    // Function to check if a number is a circular prime
    public static boolean isCircularPrime(int n) {
        if (!isPrime(n)) {
            return false;
        }

        int originalNumber = n;
        int numDigits = (int) Math.log10(n) + 1;
        ArrayList<Integer> rotations = new ArrayList<>();

        for (int i = 0; i < numDigits; i++) {
            rotations.add(n);
            n = rotateNumber(n);
        }

        for (int rotation : rotations) {
            if (!isPrime(rotation)) {
                return false;
            }
        }

        return true;
    }
}
