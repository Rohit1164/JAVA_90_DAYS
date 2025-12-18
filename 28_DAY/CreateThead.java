
public class CreateThead extends Thread {
  // public class CreateThead implements Runnable {
  // @Override
  // public synchronized void run() {
  // System.out.println("Thread is running...");
  // try {
  // Thread.sleep(1000);
  // } catch (Exception e) {
  // // TODO: handle exception
  // }
  // System.out.println("Thread is running...2222");
  // try {
  // Thread.sleep(1000);
  // } catch (Exception e) {
  // // TODO: handle exception
  // }
  // System.out.println("Thread is running...3333");
  // System.out.println("Thread is finished.");
  // }

  public void A() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("Function A " + i);
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
      }
    }
  }

  public void B() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("Function B " + i);
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
      }
    }
  }

  // Task 5: Thread Join
  // One thread prints countdown 5 → 1
  // Main thread waits using:
  // t.join();
  void countdown() {
    for (int i = 5; i >= 1; i--) {
      System.out.println(i);
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
      }
    }
    System.out.println("Countdown finished!");
  }

  public static void main(String[] args) throws InterruptedException {
    CreateThead thread = new CreateThead();
    Thread t = new Thread(() -> thread.A(), "Thread-A");
    Thread t2 = new Thread(() -> thread.B(), "Thread-B");
    t.start();
    t2.start();
    thread.countdown();
    t.join();
    System.out.println("Main thread finished.");
  }

}
