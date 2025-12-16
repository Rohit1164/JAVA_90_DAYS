// Day 12 – Abstraction + Interfaces + Multiple Implementation
abstract class Animal {
  abstract void sound();

  void sleep() {
    System.out.println("Animal is sleeping...");
  }
}

class Dog extends Animal {
  void sound() {
    System.out.println("Dog barks 🐶");
  }
}

interface Vehicle {
  void start();

  void stop();
}

class Car implements Vehicle {
  public void start() {
    System.out.println("Car starts 🚗");
  }

  public void stop() {
    System.out.println("Car stops 🛑");
  }
}

interface Payment {
  void pay();
}

class UPI implements Payment {
  public void pay() {
    System.out.println("Paying using UPI 📱");
  }
}

class CreditCard implements Payment {
  public void pay() {
    System.out.println("Paying using Credit Card 💳");
  }
}

class Cash implements Payment {
  public void pay() {
    System.out.println("Paying using Cash 💵");
  }
}

public class Abstraction_Interfaces {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.sound();
    d.sleep();
    Car c = new Car();
    c.start();
    c.stop();
    Payment p1 = new UPI();
    p1.pay();

    Payment p2 = new CreditCard();
    p2.pay();

    Payment p3 = new Cash();
    p3.pay();
  }
}
