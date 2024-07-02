
import java.sql.*;

public class CreateTable {
    public static void main(String[] args) {
        String db_url = "jdbc:mysql://localhost:3306/example";
        String user = "root";
        String password = "root";

        try(
            //create connection object;
            Connection conn = DriverManager.getConnection(db_url, user, password);
            Statement statement = conn.createStatement();

        ){
            // String sql = "Create database example";
            // statement.execute(sql);
            // System.out.println("Database created successfully. ");
            String table = "CREATE TABLE REGISTRATION " + 
            "(id int not null , " + " first_name varchar(255) not null ," + 
            " last_name varchar(244) not null )";
            statement.execute(table);
            System.out.println("Table created successfully.");

        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
