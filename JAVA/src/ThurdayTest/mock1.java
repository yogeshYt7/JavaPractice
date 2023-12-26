package ThurdayTest;

public class mock1 {

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        printPrimeWithReversed(start, end);
    }

    static void printPrimeWithReversed(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                int reversed = reverseNumber(i);
                if (isPrime(reversed) && reversed != i) {
                    System.out.println(i + " is a prime number, and its reverse " + reversed + " is also prime.");
                }
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}
