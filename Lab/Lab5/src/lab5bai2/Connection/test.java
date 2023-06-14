/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author tuanpham
 */
public class test {
    public static Connection getOracleConnection() throws ClassNotFoundException, SQLException {
        String hostName = "localhost";
        String sid = "orcl";
        String userName = "JAVALAB5_2";
        String password = "123456";

        Class.forName("oracle.jdbc.driver.OracleDriver");

        String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
        Connection conn = DriverManager.getConnection(connectionURL, userName, password);

        return conn;
    }
}