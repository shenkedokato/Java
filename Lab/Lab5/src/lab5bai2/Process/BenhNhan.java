/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import Connection.ConnectDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author tuanpham
 */
public class BenhNhan {
    public int themBenhNhan(String maBenhNhan, 
            String tenBenhNhan, Date ngaySinh, String diaChi, 
            String soDienThoai, String gioiTinh)
    {
        int countResult = 0;
        Connection con = null;
        try {
            con = ConnectDB.getConnection();
            String query = "INSERT INTO BENHNHAN VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, maBenhNhan);
            ps.setString(2, tenBenhNhan);
            ps.setDate(3, new java.sql.Date(ngaySinh.getTime()));         
            ps.setString(4, diaChi);
            ps.setString(5, soDienThoai);
            ps.setString(6,gioiTinh);
            countResult = ps.executeUpdate();   
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return countResult; 
        }
        
        return countResult;
    }
    
    public String timBenhNhan(String maBenhNhan) {
        String tenBenhNhan = "";
        try ( Connection con = ConnectDB.getConnection()) {
            String SQL = "SELECT TENBN FROM BENHNHAN WHERE MABN = '"+ maBenhNhan +"'";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery(SQL);
            while (rs.next())
            {
               tenBenhNhan = rs.getString("TENBN"); 
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return tenBenhNhan;
    }
    
    public void getListBenhNhanWithTenBacSi(JComboBox benhnhan, String bacsi) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) benhnhan.getModel();
        try ( Connection con = ConnectDB.getConnection()) {
            String SQL = "{call proc_select_benhnhanwithtenbacsi(?,?)}";
            CallableStatement ps = con.prepareCall(SQL);
            ResultSet rs = ps.executeQuery(SQL);
            while (rs.next()) {
                model.addElement((String) rs.getString("tenbn"));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
   public String timyeucau(String tenBenhNhan) {
        String yeucau = "";
        try ( Connection con = ConnectDB.getConnection()) {
            String SQL = "SELECT YEUCAUKHAM FROM BENHNHAN,KHAMBENH "
                    + "WHERE BENHNHAN.MABN = KHAMBENH.MABN AND TENBN = '"+ tenBenhNhan +"'";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery(SQL);
            while (rs.next())
            {
               yeucau = rs.getString("YEUCAUKHAM"); 
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return yeucau;
    }
}
