package PrimeNoTest;

public class PrimeNo2Rec {

    public static void main(String[] args) {
        int number = 47;
        System.out.println(number + " is prime: " + isPrime(number, 2));
    }

    public static boolean isPrime(int n, int divisor) {
        if (n < 2) return false; // Numbers less than 2 are not prime
        //if(n==divisor) return true;
        if (divisor * divisor > n) return true; // Base case: No divisors found
        if (n % divisor == 0) return false; // If divisible, not prime
        return isPrime(n, divisor + 1); // Recursive call with next divisor
    }
};