import java.util.Scanner;
import java.util.stream.IntStream;

public class FibonacciDemo {

    // 1. Iterative Method
    public static void fibonacciIterative(int n) {
        int a = 0, b = 1;
        System.out.print("Iterative: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // 2. Recursive Method
    public static int fibonacciRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void printFibonacciRecursive(int n) {
        System.out.print("Recursive: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }

    // 3. Stream Method (Java 8+)
    public static void fibonacciStream(int n) {
        System.out.print("Stream: ");
        int[] fib = {0, 1};
        IntStream.range(0, n).forEach(i -> {
            System.out.print(fib[0] + " ");
            int next = fib[0] + fib[1];
            fib[0] = fib[1];
            fib[1] = next;
        });
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("\n--- Fibonacci Series ---");
        fibonacciIterative(n);
        printFibonacciRecursive(n);
        fibonacciStream(n);
    }
}
