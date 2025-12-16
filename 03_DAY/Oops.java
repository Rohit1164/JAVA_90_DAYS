// inheritence
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

class Person {
  String name;
  int age;
}

class Employee extends Person {
  double salary;
  String jobTitle;

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Job Title: " + jobTitle);
    System.out.println("Salary: " + salary);
  }
}

// Method Overloading
class Calculator {

  int add(int a, int b) {
    return a + b;
  }

  double add(double a, double b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }
}

// Abstraction
abstract class Shape {
  abstract double area();
}

class Circle extends Shape {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double area() {
    return Math.PI * radius * radius;
  }
}

class Square extends Shape {
  double side;

  Square(double side) {
    this.side = side;
  }

  @Override
  double area() {
    return side * side;
  }
}

// Interface Database
interface Database {
  void connect();

  void disconnect();
}

class MySQL implements Database {
  public void connect() {
    System.out.println("Connected to MySQL");
  }

  public void disconnect() {
    System.out.println("Disconnected from MySQL");
  }
}

class MongoDB implements Database {
  public void connect() {
    System.out.println("Connected to MongoDB");
  }

  public void disconnect() {
    System.out.println("Disconnected from MongoDB");
  }
}

class Oops {
  public static void main(String a[]) {
    Employee emp = new Employee();
    emp.name = "Rohit";
    emp.age = 20;
    emp.jobTitle = "HR";
    emp.salary = 40000;
    emp.display();
  }
}