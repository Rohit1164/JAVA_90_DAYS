import java.sql.*;

public class Into_JDBC {

    public static void main(String[] args) {

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/MyfirstDB",
                    "root",
                    "RoHiT123@#"
            );

            // 3. SQL Query (TABLE name, NOT database name)
            String sql = "SELECT * FROM student";   // change table name if needed
            PreparedStatement ps = con.prepareStatement(sql);

            // 4. Execute
            ResultSet rs = ps.executeQuery();

            // 5. Process Result
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name")
                );
            }

            System.out.println("Connected Successfully");

            // 6. Close resources
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
