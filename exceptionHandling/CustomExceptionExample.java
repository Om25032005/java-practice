// Custom exception class
class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    static void withdraw(int balance, int amount) throws InvalidBalanceException {
        if (amount > balance) {
            throw new InvalidBalanceException("Insufficient balance!");
        }
        System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {
        try {
            withdraw(500, 1000);
        } catch (InvalidBalanceException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
