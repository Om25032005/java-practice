package searching;
import java.util.*;

public class searching {

    // ---------- 1. Linear Search ----------
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // ---------- 2. Sentinel Search ----------
    public static int sentinelSearch(int[] arr, int key) {
        int n = arr.length;
        int last = arr[n - 1];  // store last element
        arr[n - 1] = key;       // set key at last position

        int i = 0;
        while (arr[i] != key) {
            i++;
        }

        arr[n - 1] = last;  // restore last element

        if (i < n - 1 || arr[n - 1] == key) {
            return i;
        }
        return -1;
    }

    // ---------- 3. Binary Search ----------
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // ---------- 4. Fibonacci Search ----------
    public static int fibonacciSearch(int[] arr, int key) {
        int n = arr.length;

        int fib2 = 0;   // (m-2)'th Fibonacci No.
        int fib1 = 1;   // (m-1)'th Fibonacci No.
        int fibM = fib2 + fib1;  // m'th Fibonacci

        while (fibM < n) {
            fib2 = fib1;
            fib1 = fibM;
            fibM = fib2 + fib1;
        }

        int offset = -1;

        while (fibM > 1) {
            int i = Math.min(offset + fib2, n - 1);

            if (arr[i] < key) {
                fibM = fib1;
                fib1 = fib2;
                fib2 = fibM - fib1;
                offset = i;
            } else if (arr[i] > key) {
                fibM = fib2;
                fib1 = fib1 - fib2;
                fib2 = fibM - fib1;
            } else {
                return i;
            }
        }

        if (fib1 == 1 && arr[offset + 1] == key) {
            return offset + 1;
        }

        return -1;
    }

    // ---------- Main Function ----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements (sorted for Binary/Fibonacci):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        System.out.println("\n--- Searching Results ---");

        int res1 = linearSearch(arr, key);
        System.out.println("Linear Search: " + (res1 == -1 ? "Not Found" : "Found at index " + res1));

        int res2 = sentinelSearch(Arrays.copyOf(arr, arr.length), key); // copy array to protect last element
        System.out.println("Sentinel Search: " + (res2 == -1 ? "Not Found" : "Found at index " + res2));

        int res3 = binarySearch(arr, key);
        System.out.println("Binary Search: " + (res3 == -1 ? "Not Found" : "Found at index " + res3));

        int res4 = fibonacciSearch(arr, key);
        System.out.println("Fibonacci Search: " + (res4 == -1 ? "Not Found" : "Found at index " + res4));
    }
}
