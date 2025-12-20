import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

class BankAccount {
    private int balance = 0;
    private ReentrantLock lock = new ReentrantLock();

    public void deposit(int amount) {
        lock.lock(); // acquire lock
        try {
            balance += amount;
            System.out.println(Thread.currentThread().getName()
                    + " deposited " + amount
                    + " | Balance: " + balance);
        } finally {
            lock.unlock(); // 반드시 unlock
        }
    }
}

class SemaphoreExample {
    static Semaphore semaphore = new Semaphore(2);

    static void accessResource() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " entered");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " exited");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaphore.release();
        }
    }
}

class CountDownLatchExample {

    static void runExample() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable worker = () -> {
            System.out.println(Thread.currentThread().getName() + " working...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(Thread.currentThread().getName() + " finished");
            latch.countDown();
        };

        new Thread(worker).start();
        new Thread(worker).start();
        new Thread(worker).start();

        latch.await(); // main thread waits
        System.out.println("All workers completed. Main thread continues.");
    }
}

class CyclicBarrierExample {

    static void runExample() {
        CyclicBarrier barrier = new CyclicBarrier(3,
                () -> System.out.println("All threads reached barrier. Proceeding..."));

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " reached barrier");
            try {
                barrier.await();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(Thread.currentThread().getName() + " passed barrier");
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
    }
}

class AtomicIntegerExample {
    static AtomicInteger counter = new AtomicInteger(0);

    static void runExample() throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final Counter Value: " + counter.get());
    }
}

public class ConcurrencyTasksDemo {

    public static void main(String[] args) throws Exception {

        System.out.println("\n--- Task 1: ReentrantLock ---");
        BankAccount account = new BankAccount();
        new Thread(() -> account.deposit(100)).start();
        new Thread(() -> account.deposit(200)).start();

        Thread.sleep(1500);

        System.out.println("\n--- Task 2: Semaphore ---");
        for (int i = 1; i <= 5; i++) {
            new Thread(SemaphoreExample::accessResource).start();
        }

        Thread.sleep(3000);

        System.out.println("\n--- Task 3: CountDownLatch ---");
        CountDownLatchExample.runExample();

        System.out.println("\n--- Task 4: CyclicBarrier ---");
        CyclicBarrierExample.runExample();

        Thread.sleep(2000);

        System.out.println("\n--- Task 5: AtomicInteger ---");
        AtomicIntegerExample.runExample();
    }
}
