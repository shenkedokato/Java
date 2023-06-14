package net.javaguides.swing;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import java.sql.Statement;

    public class login {

        public static void main(String[] args) {

            try{
                Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/huy/IdeaProjects/swing-login-app/login.db");
                Statement statement = conn.createStatement();

                statement.execute("CREATE TABLE IF NOT EXISTS student " +
                        "(id TEXT, name TEXT, password TEXT)");
     /*           statement.execute("INSERT INTO student (id, name, password) " +
                        "VALUES(1, 'Huy', 123456) ");
                statement.execute("INSERT INTO student (id, name, password) " +
                        "VALUES(2, 'Admin', 'admin') ");
    */


            }catch (SQLException e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }
    }
