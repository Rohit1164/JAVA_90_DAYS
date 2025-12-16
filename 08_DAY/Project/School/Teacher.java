package Project.School;

public class Teacher {
  String subject;

  public Teacher(String subject) {
    this.subject = subject;
  }

  public void display() {
    System.out.println("Teacher Subject: " + subject);
  }
}
