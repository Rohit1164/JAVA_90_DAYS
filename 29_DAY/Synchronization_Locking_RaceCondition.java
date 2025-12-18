class Synchronization_Locking_RaceCondition {
  int counter = 0;

  public synchronized void increment() {
    counter++;
  }

  public static void main(String[] args) throws InterruptedException {
    Synchronization_Locking_RaceCondition example = new Synchronization_Locking_RaceCondition();
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        example.increment();
        // System.out.println(i);
      }
    });
    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        example.increment();
        // System.out.println(i);
      }
    });
    t1.start();
    t2.start();

    t1.join();
    t2.join();
    System.out.println(example.counter);
  }
}