// class BankAccount {
//   int balance = 0;
//   Object lock = new Object();

//   void deposit(int amount) {
//     if (amount <= 0) {
//       System.out.println("Deposit amount must be positive.");
//       return;
//     } else {
//       synchronized (lock) {
//         balance += amount;
//         System.out.println("Deposited " + amount + ", current balance: " + balance);
//       }
//     }
//   }

//   void withdraw(int amount) {
//     if (amount < balance) {
//       System.out.println("Insafitiant Balance");
//     } else {
//       synchronized (lock) {
//         balance -= amount;
//         System.out.println("Withdrew " + amount + ", current balance: " + balance);
//       }
//     }
//   }
// }

// class MyThreads extends Thread {
//   BankAccount acc;

//   public MyThreads(BankAccount acc) {
//     this.acc = acc;
//   }

//   public void run() {
//     acc.deposit(1000);
//   }

// }

// Task 4: Producer–Consumer (wait/notify)
// Simple version:
// Producer → value = value + 1
// Consumer → print value
// Use wait() and notify()

// class Data {
//   int value = 0;
//   boolean available = false;

//   void produce() {
//     synchronized (this) {
//       while (available) {
//         try {
//           wait();
//         } catch (Exception e) {
//           // TODO: handle exception
//         }
//       }
//       value++;
//       System.out.println("Produced: " + value);
//       available = true;
//       notify();
//     }
//   }

//   void consume() {
//     synchronized (this) {
//       while (!available) {
//         try {
//           wait();
//         } catch (Exception e) {
//           // TODO: handle exception
//         }
//       }
//       System.out.println("Consumed: " + value);
//       available = false;
//       notify();
//     }
//   }

// }

public class Task {

  public static void main(String[] args) throws InterruptedException {
    // Data data = new Data();
    // Thread t1 = new Thread(() -> {
    // for (int i = 0; i < 5; i++) {
    // data.produce();
    // }
    // });
    // Thread t2 = new Thread(() -> {
    // for (int i = 0; i < 5; i++) {
    // data.consume();
    // }
    // });
    // t1.start();
    // t2.start();

    String lock1 = "lock1";
    String lock2 = "lock2";

    Thread t1 = new Thread(() -> {
      synchronized (lock1) {
        System.out.println("Thread 1: Holding lock A...");
        try {
          Thread.sleep(1000);
        } catch (Exception e) {
          // TODO: handle exception
        }
      }
      synchronized (lock2) {
        System.out.println("Thread 1: Holding lock B...");
      }
    });

    Thread t2 = new Thread(() -> {
      synchronized (lock2) {
        System.out.println("Thread 2: Holding lock A...");
        try {
          Thread.sleep(1000);
        } catch (Exception e) {
          // TODO: handle exception
        }
      }
      synchronized (lock1) {
        System.out.println("Thread 2: Holding lock B...");
      }
    });

    t1.start();
    t2.start();
  }
}
