import java.util.Random;
public class GenerateRandomNumber {
    
    private static final int ARRAY_SIZE = 1000000;

    public static long[] generateRandomArray() {
        long[] arr = new long[ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateRandomNumber(random);
        }
        return arr;
    }

    private static long generateRandomNumber(Random random) {
        return random.nextLong();
    }

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(long[] arr) {
        int totalPrime = 0;
        for (long num : arr) {
            if (isPrime(num)) {
                totalPrime++;
            }
        }
        return totalPrime;
    }

    public static void main(String[] args) {
        long[] arr = generateRandomArray();

        long start, end;
        start = System.currentTimeMillis();
        System.out.println("Total Primes: " + countPrimes(arr));
        end = System.currentTimeMillis();
        System.out.println("Time taken for prime numbers: " + (end - start) + " milliseconds");
    }
}
