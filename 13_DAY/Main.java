
// Day 13 – Collections Framework (List, Set, Map) + Real Practice
import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Map
    HashMap<Integer, String> map = new HashMap<>();

    map.put(1, "Rohit");
    map.put(2, "Aman");
    map.put(1, "Raj");

    TreeMap<Integer, String> sortedMap = new TreeMap<>(map);
    System.out.println("Sorted Map" + sortedMap);

    // for (Map.Entry<Integer, String> e : map.entrySet()) {
    // System.out.println(e.getKey() + " → " + e.getValue());
    // }

    // Set
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how many numbers you want to add:");
    int n = sc.nextInt();

    HashSet<Integer> set = new HashSet<>();
    System.out.println("Enter Numbers:");

    for (int i = 0; i < n; i++) {
      set.add(sc.nextInt()); // duplicates auto ignore
    }

    ArrayList<Integer> sortedSet = new ArrayList<>(set);
    Collections.sort(sortedSet);

    System.out.println("Sorted set" + sortedSet);
    // set.add(10);
    // set.add(20);
    // set.add(30);
    // set.add(40);
    // set.add(10); // duplicate ignored

    // for (Integer num : set) {
    // System.out.println(num);
    // }

    // Array

    ArrayList<String> list = new ArrayList<>();

    list.add("Rohit");
    list.add("Aman");
    list.add("Mohit");
    list.add("Dipak");
    list.add("Prem");

    Collections.sort(list);
    // System.out.println("Sorted List" + list);

    //
    Collections.sort(list, Collections.reverseOrder());
    // System.out.println("Reverse Order" + list);

    // for (String name : list) {
    // System.out.println(name);
    // }

  }
}

// 🛠 Mini Project – “Inventory Manager”

// Use a HashMap to store products:

// Key = Product ID
// Value = Product Name

// Tasks:
// ✔ 5 products add karo
// ✔ 1 product delete karo (remove key)
// ✔ Search product by ID
// ✔ Print all products
