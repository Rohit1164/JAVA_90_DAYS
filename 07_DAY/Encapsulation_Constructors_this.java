class Laptop {
  // Private fields: brand, price
  private String brand;
  private double price;

  // Constructor banao and object create karo.
  Laptop(String brand, double price) {
    this.brand = brand;
    this.price = price;
  }

  // Getters/Setters banao
  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

}

class Person {

  private String name;
  private int age;

  // Constructor with parameters
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
  // Display method banao
  // 3 objects banao — values print karo.
}

public class Encapsulation_Constructors_this {
  public static void main(String[] args) {
    // Laptop obj = new Laptop("HP", 20000);
    // obj.setBrand("ACCER");
    // System.out.println(obj.getBrand());
    // System.out.println(obj.getPrice());
    // Laptop obj2 = new Laptop("DELL", 45000);
    // obj.setPrice(50000);
    // System.out.println(obj2.getBrand());
    // System.out.println(obj2.getPrice());
    Person obj = new Person("Rohit", 20);
    System.out.print(obj.getName() + " ");
    System.out.println(obj.getAge());
    Person obj1 = new Person("mohit", 23);
    System.out.print(obj1.getName() + " ");
    System.out.println(obj1.getAge());
    Person obj2 = new Person("Jit", 19);
    System.out.print(obj2.getName() + " ");
    System.out.println(obj2.getAge());
  }
}
