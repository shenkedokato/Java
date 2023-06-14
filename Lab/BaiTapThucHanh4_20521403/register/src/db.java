import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class db {

    public static void main(String[] args) {

        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:account.db");
            Statement statement = conn.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS account " +
                    "(first_name TEXT, last_name TEXT, user_name TEXT, password TEXT, email_id TEXT, mobile_number TEXT )");

        }catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}