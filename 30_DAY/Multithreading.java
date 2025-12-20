import java.util.concurrent.*;

class Multithreading implements Runnable {
  public void run() {
    System.out.println(Thread.currentThread().getName() + " is running");

  }

  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(3);
    Multithreading task = new Multithreading();

    for (int i = 0; i < 5; i++) {
      executor.execute(task);
    }

    executor.shutdown();
  }
}