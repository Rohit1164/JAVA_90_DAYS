
class Student extends Thread {
  public void run() {
    System.out.println("Thread is running");
  }

  int add(int a, int b) {
    return a + b;
  }
}
// Task 2: Custom Functional Interface
// Create:
// @FunctionalInterface
// interface Calculator {
// int operate(int a, int b);
// }
// Use lambda for add, subtract.

@FunctionalInterface
interface Calculator {
  int operate(int a, int b);
}

@FunctionalInterface
interface EvenOdd {
  void check(int a);
}

public class Lambda_FunctionalInterface {
  public static void main(String[] args) {
    // Functional Interface Example
    Runnable r = () -> System.out.println("Hello from a functional interface!");
    r.run();
    // ✅ Task 1: Lambda with Runnable
    // Student s = new Student();
    // Thread t = new Thread(() -> System.out.println(s.add(10, 20)));
    // t.start();

    // ✅ Task 2: Custom Functional Interface
    // Calculator add = (a, b) -> a + b;
    // Calculator subtract = (a, b) -> a - b;
    // System.out.println("Addition: " + add.operate(10, 5));
    // System.out.println("Subtraction: " + subtract.operate(10, 5));

    // ✅ Task 3: Predicate Example
    // --- First Method ---
    // java.util.function.Predicate<Integer> isEven = n -> n % 2 == 0;
    // System.out.println("Is 4 even? " + isEven.test(4));
    // System.out.println("Is 7 even? " + isEven.test(7));
    // --- Second Method ---
    // EvenOdd evenOdd = (a) -> {
    // if (a % 2 == 0) {
    // System.out.println("Even");
    // } else {
    // System.out.println("Odd");
    // }
    // };
    // evenOdd.check(7);
    // evenOdd.check(10);

    // ✅ Task 4: Consumer Example
    // java.util.function.Consumer<String> printName = name ->
    // System.out.println("Name: " + name);
    // printName.accept("Alice");
    // printName.accept("Bob");

    // ✅ Task 5: Function Example
    // java.util.function.Function<String, Integer> stringLength = str ->
    // str.length();
    // System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));
  }
}
