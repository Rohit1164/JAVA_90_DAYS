import java.util.Scanner;

// Custom Exception for Wrong PIN
class InvalidPinException extends Exception {
  public InvalidPinException(String message) {
    super(message);
  }
}

// Custom Exception for Low Balance
class InsufficientBalanceException extends Exception {
  public InsufficientBalanceException(String message) {
    super(message);
  }
}

public class ATM {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int correctPin = 1234;
    int balance = 10000;

    try {
      System.out.print("Enter your PIN: ");
      int pin = sc.nextInt();

      if (pin != correctPin) {
        throw new InvalidPinException("Invalid PIN! Access Denied.");
      }

      System.out.print("Enter amount to withdraw: ");
      int amount = sc.nextInt();

      if (amount > balance) {
        throw new InsufficientBalanceException(
            "Insufficient Balance! Your Balance: " + balance);
      }

      balance -= amount;
      System.out.println("Withdraw Successful!");
      System.out.println("Remaining Balance: " + balance);

    } catch (InvalidPinException e) {
      System.out.println("Error: " + e.getMessage());

    } catch (InsufficientBalanceException e) {
      System.out.println("Error: " + e.getMessage());

    } finally {
      System.out.println("Transaction Complete");
    }

    sc.close();
  }
}
