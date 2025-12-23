import java.util.*;
import java.util.stream.Collectors;

class Student {
  int id;
  String name;
  String department;

  Student(int id, String name, String department) {
    this.id = id;
    this.name = name;
    this.department = department;
  }

  public String getDepartment() {
    return department;
  }

  public String toString() {
    return name;
  }
}

public class Stream_API {
  public static void main(String[] args) {
    // Stream API in Java 8 allows for functional-style operations on streams of
    // elements.
    // Example: Using Stream API to filter and print even numbers from a list.
    // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // numbers.stream()
    // .filter(n -> n % 2 == 0)
    // .forEach(System.out::println);

    // Task 2: map()
    // List<String> str = Arrays.asList("rohit", "akash");
    // List<String> uppercase = str.stream().map(x -> x.toUpperCase()).toList();
    // System.out.println(uppercase);

    // Task 3: sorted()
    // List<Integer> numbers = Arrays.asList(4, 10, 6, 3, 2, 1, 5);
    // List<Integer> sorted =
    // numbers.stream().sorted().collect(Collectors.toList());
    // System.out.println(sorted);

    // Task: Reduce
    // List<Integer> numbers = Arrays.asList(4, 10, 6, 3, 2, 1, 5);
    // int sum = numbers.stream().reduce(0, (num, acc) -> num + acc);
    // System.out.println(sum);

    List<Student> students = Arrays.asList(
        new Student(1, "Rohit", "IT"),
        new Student(2, "Amit", "HR"),
        new Student(3, "Neha", "IT"),
        new Student(4, "Suman", "HR"),
        new Student(5, "Pooja", "Finance"));

    Map<String, List<Student>> groupByDept = students.stream()
        .collect(Collectors.groupingBy(Student::getDepartment));

    System.out.println(groupByDept);

  }
}
