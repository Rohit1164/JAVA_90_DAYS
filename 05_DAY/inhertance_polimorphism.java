class Animal {
  void eat() {
    System.out.println("Animals eating...");
  }
}

class Dog extends Animal {
  void eat() {
    System.out.println("Dogs eats bones");
  }

  void sound() {
    System.out.println("Bow Bow");
  }
}

class Cat extends Animal {
  void eat() {
    System.out.println("Cats eats...");
  }

  void sound() {
    System.out.println("Miau Miau");
  }
}

class Calculator {
  void add(int a, int b) {
    System.out.println(a + b);
  }

  void add(double a, double b) {
    System.out.println(a + b);
  }

  void add(int a, int b, int c) {
    System.out.println(a + b + c);
  }
}

public class inhertance_polimorphism {
  public static void main(String[] args) {
    Calculator c = new Calculator();
    c.add(8.0, 12.0);
    c.add(10, 20);
    c.add(14, 34, 43);
  }
}
