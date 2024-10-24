public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number = 22; // Hardcoded input number

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }