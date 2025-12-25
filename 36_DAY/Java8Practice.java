import java.util.*;
import java.util.stream.*;

class Java8Practice {

    // Task 4: Constructor Reference – Student class
    static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }

        void display() {
            System.out.println("Student Name: " + name);
        }
    }

    public static void main(String[] args) {

        // ===============================
        // ✅ Task 1: Optional orElse()
        // ===============================
        System.out.println("Task 1: Optional orElse");

        String input = null; // try with "Java"
        Optional<String> optional = Optional.ofNullable(input);

        String result = optional.orElse("Default Value");
        System.out.println("Result: " + result);

        // ===============================
        // ✅ Task 2: Optional ifPresent()
        // ===============================
        System.out.println("\nTask 2: Optional ifPresent");

        Optional<String> optStr = Optional.of("Java8");

        optStr.ifPresent(s -> System.out.println("Length: " + s.length()));

        // ===============================
        // ✅ Task 3: Method Reference
        // ===============================
        System.out.println("\nTask 3: Method Reference");

        List<String> names = Arrays.asList("Rohit", "Java", "Stream");

        // Lambda
        // names.forEach(name -> System.out.println(name));

        // Method Reference
        names.forEach(System.out::println);

        // ===============================
        // ✅ Task 4: Constructor Reference
        // ===============================
        System.out.println("\nTask 4: Constructor Reference");

        List<String> studentNames = Arrays.asList("Amit", "Neha", "Rahul");

        List<Student> students = studentNames.stream()
                .map(Student::new) // Constructor Reference
                .collect(Collectors.toList());

        students.forEach(Student::display);

        // ===============================
        // ✅ Task 5: Parallel Stream
        // ===============================
        System.out.println("\nTask 5: Stream vs Parallel Stream");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10_000_000; i++) {
            numbers.add(i);
        }

        // Normal Stream
        long startTime = System.currentTimeMillis();

        long sum1 = numbers.stream()
                .mapToLong(n -> n)
                .sum();

        long endTime = System.currentTimeMillis();
        System.out.println("Stream Sum: " + sum1);
        System.out.println("Stream Time: " + (endTime - startTime) + " ms");

        // Parallel Stream
        startTime = System.currentTimeMillis();

        long sum2 = numbers.parallelStream()
                .mapToLong(n -> n)
                .sum();

        endTime = System.currentTimeMillis();
        System.out.println("Parallel Stream Sum: " + sum2);
        System.out.println("Parallel Stream Time: " + (endTime - startTime) + " ms");
    }
}
