import java.util.Scanner;

public class ArmstrongNumberDemo {

    // 1. Iterative Method
    public static boolean isArmstrongIterative(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, digits);
            num /= 10;
        }

        return sum == original;
    }

    // 2. Recursive Method
    public static int power(int n, int r) {
        if (r == 0) return 1;
        return n * power(n, r - 1);
    }

    public static int sumOfPowers(int num, int digits) {
        if (num == 0) return 0;
        return power(num % 10, digits) + sumOfPowers(num / 10, digits);
    }

    public static boolean isArmstrongRecursive(int num) {
        int digits = String.valueOf(num).length();
        return num == sumOfPowers(num, digits);
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\n--- Armstrong Check ---");

        System.out.println("Iterative Method: " + (isArmstrongIterative(num) ? "Armstrong" : "Not Armstrong"));
        System.out.println("Recursive Method: " + (isArmstrongRecursive(num) ? "Armstrong" : "Not Armstrong"));
    }
}
