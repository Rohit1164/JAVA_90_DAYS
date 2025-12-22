import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Deserialization {
    public static void main(String[] args) {

        String filePath = "./SerializationDemo.ser"; // ✔ Correct file

        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Student student = (Student) ois.readObject(); // 🔹 Deserialization

            // System.out.println("ID: " + student.id);
            // System.out.println("Name: " + student.name);
            // System.out.println("Age: " + student.age);

            ois.close();
            fis.close();

            System.out.println("Object Deserialized Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
