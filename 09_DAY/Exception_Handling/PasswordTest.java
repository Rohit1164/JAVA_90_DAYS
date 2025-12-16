import java.util.Scanner;

class PasswordException extends Exception {
  public PasswordException(String message) {
    super(message);
  }
}

public class PasswordTest {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter password: ");
    String password = sc.nextLine();

    try {
      if (password.length() < 6) {
        throw new PasswordException("Password must be at least 6 characters!");
      } else {
        System.out.println("Password Accepted!");
      }
    } catch (PasswordException e) {
      System.out.println("Exception: " + e.getMessage());
    }

    sc.close();
  }
}
