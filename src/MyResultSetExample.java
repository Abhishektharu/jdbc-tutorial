
import  java.sql.*;

public class MyResultSetExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/example";
        String user = "root";
        String password = "root";

        try(Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM registration")){
                while(rs.next()){
                    int id = rs.getInt("id");
                    String first_name = rs.getString("first_name");
                    System.out.println("id: " + id);
                    System.out.println("first name: " + first_name);
                }
            }
            catch(SQLException e){
                System.out.println(e);
            }
    }
}
