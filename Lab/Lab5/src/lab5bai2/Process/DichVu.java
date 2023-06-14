/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import Connection.ConnectDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tuanpham
 */
public class DichVu {
    public void getListDichVu(JTable dichvu) {
        DefaultTableModel model = (DefaultTableModel) dichvu.getModel();
        try ( Connection con = ConnectDB.getConnection()) {
            String SQL = "SELECT TENDV FROM DICHVU";
            String row[];
            row = new String[1];
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()) {
                row[0] = rs.getString("tendv");
                model.addRow(row);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
