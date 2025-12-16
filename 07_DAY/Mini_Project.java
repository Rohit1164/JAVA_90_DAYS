class Employee {

  private int id;
  private String name;
  double salary;

  Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  void showDetails() {
    System.out.println("Employee ID: " + this.id);
    System.out.println("Employee Name: " + this.name);
    System.out.println("Employee Salary: " + this.salary);
  }
}

public class Mini_Project {
  public static void main(String[] args) {
    Employee emp = new Employee(101, "Rohit", 25500);
    emp.showDetails();
  }
}
