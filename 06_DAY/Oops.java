// Parent Class
class Vehicle {
  void start() {
    System.out.println("Vehicle started");
  }
}

// Child Class
class Swift extends Vehicle {
  @Override
  void start() {
    System.out.println("Swift started");
  }
}

// Employee Parent Class
class Employee {
  String role;

  void showRole() {
    System.out.println("Role: Employee");
  }
}

// Developer Child Class
class Developer extends Employee {

  @Override
  void showRole() {
    System.out.println("Role: Developer (Writes code)");
  }
}

// Manager Child Class
class Manager extends Employee {

  @Override
  void showRole() {
    System.out.println("Role: Manager (Manages team)");
  }
}

class BankAccount {
  double balance;

  BankAccount(double balance) {
    this.balance = balance;
  }

  void deposit(double amount) {
    this.balance += amount;
    System.out.println("Deposit Balance : " + this.balance);
    System.out.println();
  }

  void withdraw(double amount) {
    this.balance -= amount;
    System.out.println("Withdraw Balance : " + this.balance);
  }

  void getBalance() {
    System.out.println("Total Balance : " + this.balance);
  }

}

class SavingAccount extends BankAccount {
  double interestRate;

  SavingAccount(double balance, double interestRate) {
    super(balance);
    this.interestRate = interestRate;
  }

  void showDetails() {
    System.out.println("--- Saving Account Details ---");
    System.out.println("Balance: " + balance);
    System.out.println("Interest Rate: " + interestRate + "%");
    System.out.println();

  }
}

class CurrentAccount extends BankAccount {
  double overdraftLimit;

  CurrentAccount(double balance, double overdraftLimit) {
    super(balance);
    this.overdraftLimit = overdraftLimit;
  }

  void showDetails() {
    System.out.println("--- Current Account Details ---");
    System.out.println("Balance: " + balance);
    System.out.println("Overdraft Limit: " + overdraftLimit);
    System.out.println();

  }

  // Overriding withdraw()
  void withdraw(double amount) {
    if (amount <= balance + overdraftLimit) {
      balance -= amount;
      System.out.println("--- Overdraft Details ---");
      System.out.println("Withdrawn: " + amount);
      System.out.println("Remaining Balance: " + balance);

    } else {
      System.out.println("Overdraft Limit Exceeded!");
    }
    System.out.println();

  }
}

public class Oops {
  public static void main(String[] args) {
    BankAccount ba = new BankAccount(3000);
    ba.getBalance();
    ba.withdraw(2000);
    ba.deposit(500);
    SavingAccount sa = new SavingAccount(1000, 2);
    sa.showDetails();
    CurrentAccount ca = new CurrentAccount(1000, 5000);
    ca.showDetails();
    ca.withdraw(500);
  }
}
