package beginnerlevel;

import java.util.Scanner;

public class GeneratePrime {
    public static void generatePrimes(long lowerBound, long upperBound) {
        for (long num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {  //number that divisible by only itself or one
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long start = sc.nextInt();
            long end = sc.nextInt();
            generatePrimes(start, end);
        }
    }
}
