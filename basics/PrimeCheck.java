import java.util.Scanner;

public class PrimeCheck {

    // Function to check prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;   // 0 and 1 are not prime
        if (n == 2) return true;    // 2 is prime
        if (n % 2 == 0) return false; // even numbers >2 are not prime

        // check divisors up to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }
    }
}
