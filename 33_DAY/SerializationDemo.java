import java.io.*;

class Student implements Serializable {
  private static final long serialVersionUID = 1L;
  int id;
  String name;
  int age;

  Student(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}

class SerializationDemo {
  public static void main(String[] args) {

    Student student = new Student(1, "Alice", 20);
    String filePath = "student.ser";

    try {
      FileOutputStream fos = new FileOutputStream(filePath);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      oos.writeObject(student); // 🔹 Serialization

      oos.close();
      fos.close();

      System.out.println("Object Serialized Successfully");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
