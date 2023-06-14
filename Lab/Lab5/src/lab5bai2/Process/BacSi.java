/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import Connection.ConnectDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author tuanpham
 */
public class BacSi {
    public void getListBacSi(JComboBox bacsi) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) bacsi.getModel();
        try ( Connection con = ConnectDB.getConnection()) {
            String SQL = "SELECT DISTINCT TENBS FROM BACSI";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()) {
                model.addElement((String) rs.getString("tenbs"));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
