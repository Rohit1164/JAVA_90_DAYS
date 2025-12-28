import java.sql.*;

public class ResultSetAdvancedDemo {

    // 🔹 Database details
    static final String URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root";
    static final String PASSWORD = "root";

    // 🔹 Get Connection
    static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {

        try {
            Connection con = getConnection();

            // Create Scrollable + Updatable ResultSet
            Statement st = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = st.executeQuery("SELECT * FROM students");

            // ✅ Task 1: Scrollable ResultSet
            System.out.println("---- Task 1: Scrollable ResultSet ----");

            rs.first();
            System.out.println("FIRST  : " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

            rs.last();
            System.out.println("LAST   : " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

            rs.previous();
            System.out.println("PREV   : " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

            // ✅ Task 2: absolute() & relative()
            System.out.println("\n---- Task 2: absolute() & relative() ----");

            rs.absolute(3);
            System.out.println("ABS(3): " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

            rs.relative(2);
            System.out.println("REL(+2): " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

            // ✅ Task 3: Updatable ResultSet
            System.out.println("\n---- Task 3: Updatable ResultSet ----");

            rs.absolute(2);
            rs.updateInt("marks", 99);
            rs.updateRow();
            System.out.println("Marks updated using ResultSet");

            // ✅ Task 4: ResultSetMetaData
            System.out.println("\n---- Task 4: ResultSetMetaData ----");

            ResultSetMetaData rsmd = rs.getMetaData();
            int colCount = rsmd.getColumnCount();

            System.out.println("Total Columns: " + colCount);

            for (int i = 1; i <= colCount; i++) {
                System.out.println(
                        "Column " + i +
                                " | Name: " + rsmd.getColumnName(i) +
                                " | Type: " + rsmd.getColumnTypeName(i));
            }

            // ✅ Task 5: DatabaseMetaData
            System.out.println("\n---- Task 5: DatabaseMetaData ----");

            DatabaseMetaData dbmd = con.getMetaData();

            System.out.println("Database Name   : " + dbmd.getDatabaseProductName());
            System.out.println("Database Version: " + dbmd.getDatabaseProductVersion());
            System.out.println("Driver Name     : " + dbmd.getDriverName());

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
