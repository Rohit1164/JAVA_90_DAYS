import java.sql.*;

public class Crud_Operation {

    // 🔹 Database details
    static final String URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root";
    static final String PASSWORD = "root";

    // 🔹 Get Connection
    static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // ✅ Task 1: INSERT 3 Students
    static void insertStudents() throws Exception {
        Connection con = getConnection();
        String sql = "INSERT INTO students VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, 1);
        ps.setString(2, "Amit");
        ps.setInt(3, 85);
        ps.executeUpdate();

        ps.setInt(1, 2);
        ps.setString(2, "Rohit");
        ps.setInt(3, 90);
        ps.executeUpdate();

        ps.setInt(1, 3);
        ps.setString(2, "Neha");
        ps.setInt(3, 88);
        ps.executeUpdate();

        con.close();
        System.out.println("✔ 3 Students Inserted");
    }

    // ✅ Task 2: SELECT All Students
    static void fetchStudents() throws Exception {
        Connection con = getConnection();
        String sql = "SELECT * FROM students";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        System.out.println("\nID | NAME | MARKS");
        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " | " +
                rs.getString("name") + " | " +
                rs.getInt("marks")
            );
        }
        con.close();
    }

    // ✅ Task 3: UPDATE marks
    static void updateMarks(int id, int marks) throws Exception {
        Connection con = getConnection();
        String sql = "UPDATE students SET marks=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, marks);
        ps.setInt(2, id);
        ps.executeUpdate();

        con.close();
        System.out.println("✔ Marks Updated");
    }

    // ✅ Task 4: DELETE student
    static void deleteStudent(int id) throws Exception {
        Connection con = getConnection();
        String sql = "DELETE FROM students WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);
        ps.executeUpdate();

        con.close();
        System.out.println("✔ Student Deleted");
    }

    // ✅ Task 5 & 6: Batch Insert + Transaction
    static void batchInsertWithTransaction() {
        Connection con = null;

        try {
            con = getConnection();
            con.setAutoCommit(false);

            String sql = "INSERT INTO students VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            for (int i = 4; i <= 8; i++) {
                ps.setInt(1, i);
                ps.setString(2, "Student" + i);
                ps.setInt(3, 70 + i);
                ps.addBatch();
            }

            ps.executeBatch();
            con.commit();

            System.out.println("✔ Batch Insert Successful");

        } catch (Exception e) {
            try {
                if (con != null) {
                    con.rollback();
                    System.out.println("❌ Transaction Rolled Back");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args) throws Exception {

        insertStudents();      // Task 1
        fetchStudents();       // Task 2

        updateMarks(2, 95);    // Task 3
        deleteStudent(1);      // Task 4

        batchInsertWithTransaction(); // Task 5 & 6
    }
}
