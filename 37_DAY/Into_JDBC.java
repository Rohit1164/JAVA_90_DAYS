import java.sql.*;

class Into_JDBC {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");

      Connection con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/MyfirstDB",
          "root",
          "rohit@123");
      PreparedStatement ps = con.prepareStatement("SELECT * FROM DB");
      ResultSet rs = ps.executeQuery();

      // 5. Process result
      while (rs.next()) {
        System.out.println(
            rs.getInt("id") + " " +
                rs.getString("name"));
        System.out.println("connect Successfully");
      }

      rs.close();
      ps.close();
      con.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}