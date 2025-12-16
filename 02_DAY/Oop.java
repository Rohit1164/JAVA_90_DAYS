
class Car {
  String name;
  int model;
  int price;

  Car(String n, int m, int p) {
    this.name = n;
    this.model = m;
    this.price = p;
  }

  void show() {
    System.out.println("Name :" + this.name);
    System.out.println("Model :" + this.model);
    System.out.println("Price :" + this.price);
  }
}

class Rectangle {
  double length;
  double width;

  Rectangle(double l, double w) {
    this.length = l;
    this.width = w;
  }

  double calculateArea() {
    return length * width;
  }
}

class BankAccount {
  private double balance = 2000;

  void deposit(double amount) {
    this.balance += amount;
    System.out.println("Deposit Balance : " + this.balance);
  }

  void withdraw(double amount) {
    this.balance -= amount;
    System.out.println("Withdraw Balance : " + this.balance);
  }

  void getBalance() {
    System.out.println("Total Balance : " + this.balance);

  }
}

class Employee {
  String name;
  int salary;
  String department;

  Employee(String n, int s, String d) {
    this.name = n;
    this.salary = s;
    this.department = d;
  }

  void show() {
    System.out.println("Name : " + this.name);
    System.out.println("Salary : " + this.salary);
    System.out.println("Department : " + this.department);
  }
}

class Student {
  String name;
  int roll;
  String course;

  Student(String n, int r, String c) {
    this.name = n;
    this.roll = r;
    this.course = c;
  }

  void displayInfo() {
    System.out.println("Name: " + name + ", Roll: " + roll + ", Course: " + course);
  }

  void changeCourse(String newCourse) {
    this.course = newCourse;
  }

}

public class Oop {
  public static void main(String[] args) {
    Student s = new Student("Rohit", 1001, "Machenical");
    Student s1 = new Student("Jitendra", 1002, "Finance");

    s.displayInfo();
    s1.displayInfo();
    s1.changeCourse("Information Technology");

    System.out.println("After course change:");
    s1.displayInfo();
  }
}
