import java.util.*;

class SpiralMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Spiral print
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        System.out.println("Spiral Order:");
        while (top <= bottom && left <= right) {
            // 1. left → right
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++;

            // 2. top → bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // 3. right → left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }

            // 4. bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}
