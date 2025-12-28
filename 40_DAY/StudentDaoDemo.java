import java.sql.*;
import java.util.*;

// Task 1: Student Entity
class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + marks;
    }
}

// Task 2: DAO Interface
interface StudentDao {
    void addStudent(Student s);

    List<Student> getAllStudents();

    Student getStudentById(int id);

    void updateMarks(int id, int marks);

    void deleteStudent(int id);
}

// Task 4: Connection Pool (Conceptual)
class DataSourceConfig {

    // HikariCP style (Concept ONLY – not integrated)
    /*
     * HikariConfig config = new HikariConfig();
     * config.setJdbcUrl("jdbc:mysql://localhost:3306/testdb");
     * config.setUsername("root");
     * config.setPassword("root");
     * config.setMaximumPoolSize(10);
     * DataSource ds = new HikariDataSource(config);
     */

    static final String URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root";
    static final String PASSWORD = "root";

    static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

// Task 3: DAO Implementation (JDBC)
class StudentDaoImpl implements StudentDao {

    @Override
    public void addStudent(Student s) {
        try (Connection con = DataSourceConfig.getConnection()) {

            String sql = "INSERT INTO students VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getMarks());
            ps.executeUpdate();

            System.out.println("✔ Student Inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();

        try (Connection con = DataSourceConfig.getConnection()) {

            String sql = "SELECT * FROM students";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(
                        new Student(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getInt("marks")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Student getStudentById(int id) {
        try (Connection con = DataSourceConfig.getConnection()) {

            String sql = "SELECT * FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("marks"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateMarks(int id, int marks) {
        try (Connection con = DataSourceConfig.getConnection()) {

            String sql = "UPDATE students SET marks=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, marks);
            ps.setInt(2, id);
            ps.executeUpdate();

            System.out.println("✔ Marks Updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(int id) {
        try (Connection con = DataSourceConfig.getConnection()) {

            String sql = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("✔ Student Deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Task 5: Test DAO
public class StudentDaoDemo {

    public static void main(String[] args) {

        StudentDao dao = new StudentDaoImpl();

        // INSERT
        dao.addStudent(new Student(1, "Rohit", 85));
        dao.addStudent(new Student(2, "Amit", 90));

        // FETCH ALL
        System.out.println("\n--- All Students ---");
        for (Student s : dao.getAllStudents()) {
            System.out.println(s);
        }

        // FETCH BY ID
        System.out.println("\n--- Student By ID ---");
        System.out.println(dao.getStudentById(1));

        // UPDATE
        dao.updateMarks(1, 95);

        // DELETE
        dao.deleteStudent(2);
    }
}
