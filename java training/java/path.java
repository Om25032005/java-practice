import java.util.Scanner;

public class path {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int paths[][] = new int[rows][cols];

        for (int col = 0; col < cols; col++) {
            paths[0][col] = 1;
        }

        for (int row = 0; row < rows; row++) {
            paths[row][0] = 1;
        }

        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                paths[row][col] = paths[row - 1][col] + paths[row][col - 1];
            }
        }

        System.out.println("Number of unique paths: " + paths[rows - 1][cols - 1]);
    }
}
