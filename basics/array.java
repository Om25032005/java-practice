import java.util.Scanner;

public class array {
    
    // Function to print matrix in spiral order
    public static void printSpiral(int[][] matrix, int n, int m) {
        int top = 0, bottom = n - 1, left = 0, right = m - 1;

        System.out.println("Spiral Order:");
        while (top <= bottom && left <= right) {
            
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Print bottom row (if exists)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column (if exists)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
        System.out.println();
    }

    // Function to print normal matrix
    public static void printMatrix(int[][] matrix, int n, int m) {
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] arr, int n, int m) {
    // Step 1: Transpose the matrix
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < m; j++) {  // j starts from i+1
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }

    // Step 2: Reverse each row
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m / 2; j++) {  // only half swap
            int temp = arr[i][j];
            arr[i][j] = arr[i][m - j - 1];
            arr[i][m - j - 1] = temp;
        }
    }

    // Print rotated matrix
    printMatrix(arr, n, m);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        System.out.print("Enter columns: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print normal matrix
        printMatrix(matrix, n, m);
        rotate(matrix,n,m);
        
        // Print spiral order
        // printSpiral(matrix, n, m);


        sc.close();
    }
}
