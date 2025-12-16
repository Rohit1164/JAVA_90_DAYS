import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Task {
  public static void main(String[] args) {
    // Create HashSet
    Set<Integer> set = new LinkedHashSet<>();
    set.add(10);
    set.add(30);
    set.add(20);
    set.add(5);

    System.out.println(set);
    // Create TreeSet
    Set<String> set1 = new TreeSet<>();
    set1.add("Banana");
    set1.add("Orange");
    set1.add("Grapes");
    set1.add("Apple");

    System.out.println(set1);
    // Create HashMap
    HashMap<Integer, String> map = new HashMap<>();

    map.put(1, "Rohit");
    map.put(2, "Amit");
    map.put(3, "Suman");
    map.put(2, "Rahul");
    map.remove(1);

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println("Roll: " + entry.getKey() +
          " Name: " + entry.getValue());
    }

    // Create LinkedHashMap
    LinkedHashMap<Integer, String> products = new LinkedHashMap<>();

    products.put(101, "Laptop");
    products.put(102, "Mobile");
    products.put(103, "Tablet");

    for (Map.Entry<Integer, String> entry : products.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

    // Create TreeMap
    TreeMap<Integer, String> students = new TreeMap<>();

    students.put(5, "Ravi");
    students.put(1, "Amit");
    students.put(3, "Neha");
    students.put(2, "Pooja");
    students.put(4, "Sohan");

    // Print sorted data
    for (Map.Entry<Integer, String> entry : students.entrySet()) {
      System.out.println("Roll: " + entry.getKey() +
          " Name: " + entry.getValue());
    }
  }
}