import java.util.concurrent.*;
import java.util.*;

public class ExecutorTasksDemo {

  public static void main(String[] args) throws Exception {

    /*
     * =========================
     * Task 1: Executor + Runnable
     * =========================
     */
    ExecutorService executor = Executors.newFixedThreadPool(3);

    for (int i = 1; i <= 5; i++) {
      int taskNumber = i;
      executor.submit(() -> {
        System.out.println(
            "Task " + taskNumber +
                " executed by " +
                Thread.currentThread().getName());
      });
    }

    /*
     * =========================
     * Task 2: Executor + Callable
     * =========================
     */
    Callable<Integer> sumTask = () -> {
      int sum = 0;
      for (int i = 1; i <= 10; i++) {
        sum += i;
      }
      return sum;
    };

    Future<Integer> sumResult = executor.submit(sumTask);
    System.out.println("Sum of 1–10 = " + sumResult.get());

    /*
     * =========================
     * Task 3: Multiple Callable Tasks
     * =========================
     */
    List<Callable<String>> callables = new ArrayList<>();

    for (int i = 1; i <= 3; i++) {
      int taskId = i;
      callables.add(() -> "Result from Callable Task " + taskId +
          " | Thread: " + Thread.currentThread().getName());
    }

    List<Future<String>> results = executor.invokeAll(callables);

    for (Future<String> future : results) {
      System.out.println(future.get());
    }

    /*
     * =========================
     * Task 5: Real-World Example
     * Order Processing System
     * =========================
     */
    for (int orderId = 1; orderId <= 6; orderId++) {
      int currentOrder = orderId;
      executor.submit(() -> {
        System.out.println(
            "Order " + currentOrder +
                " processed by " +
                Thread.currentThread().getName());
        try {
          Thread.sleep(1000); // simulate processing
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      });
    }

    /*
     * =========================
     * Task 4: Shutdown Executor
     * =========================
     */
    executor.shutdown();

    if (executor.awaitTermination(5, TimeUnit.SECONDS)) {
      System.out.println("All tasks completed. Executor shut down.");
    } else {
      executor.shutdownNow();
      System.out.println("Executor forced shutdown.");
    }
  }
}
