package Project.App;

import Project.School.Student;
import Project.School.Teacher;

public class main {
  public static void main(String[] args) {

    Student s1 = new Student("Rohit", 101);
    Teacher t1 = new Teacher("Mathematics");

    s1.display();
    t1.display();
  }
}
