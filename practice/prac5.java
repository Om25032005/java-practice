import java.util.Scanner;
//prime number range
class prac5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Input validation
        if(a < 1 || b < 1 || a >= b){
            System.out.println("Provide valid input");
            return;
        }

        System.out.println("Prime numbers in the range [" + a + ", " + b + "]:");

        while(a <= b) {             // while loop for the range
            if(a > 1) {             // skip 1
                boolean isPrime = true;
                for(int i = 2; i <= Math.sqrt(a); i++){  // check divisibility
                    if(a % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                    System.out.print(a + " ");
            }
            a++;                     // move to next number
        }
    }
}
