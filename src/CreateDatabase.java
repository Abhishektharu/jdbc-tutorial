
import java.sql.*;

public class CreateDatabase {

    public static void main(String[] args) {
        String db_url = "jdbc:mysql://localhost:3306/";
        String user_name = "root";
        String password = "root";

        try (
                Connection conn = DriverManager.getConnection(db_url, user_name, password); Statement statement = conn.createStatement();) {
            String sql = "CREATE DATABASE STUDENTS";
            statement.executeUpdate(sql);
            System.out.println("Database created successfully...");
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
