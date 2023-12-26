package YOGESH;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        List<Integer> oddNumbers = findOdds(numbers);
        System.out.println(oddNumbers);
        List<Integer> primeNumbers = findPrimes(oddNumbers);
        System.err.println(primeNumbers);
        int sumOfPrimes = calculateSum(primeNumbers);
        System.err.println(sumOfPrimes);
        boolean isHappy = isPrime(sumOfPrimes);
        if (isHappy) {
            System.out.println("Happy");
        } else {
            System.out.println("Not Happy");
        }
    }

    private static List<Integer> findOdds(int[] numbers) {
        List<Integer> odds = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                odds.add(num);
            }
        }
        return odds;
    }

    private static List<Integer> findPrimes(List<Integer> numbers) {
        List<Integer> primes = new ArrayList<>();
        for (int num : numbers) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

    private static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
