import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;  // Store the original number
        int reversedNum = 0;    // To store the reversed number

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;           // Get last digit
            reversedNum = reversedNum * 10 + digit; // Append digit
            num = num / 10;                 // Remove last digit
        }

        // Check if original and reversed are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

        sc.close();
    }
}
