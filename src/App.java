
import java.sql.*;

public class App {
    // to get the current user : select current_user() in cli of mysql;

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/example",
                    "root", "root");

            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from persons");
            int code;
            String title;
            while (resultSet.next()) {
                code = resultSet.getInt("PersonID");
                title = resultSet.getString("LastName").trim();
                System.out.println("Code : " + code
                        + " Title : " + title);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception exception) {
            System.out.println(exception);
        }

    }
}
