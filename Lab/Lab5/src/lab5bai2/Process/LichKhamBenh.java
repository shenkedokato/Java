/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import Connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author tuanpham
 */
public class LichKhamBenh {
    public int themLichKham(String maBenhNhan, 
            Date ngayKham, String yeuCau, String tenbs)
    {
        int countResult = 0;
        Connection con = null;
        try {
            con = ConnectDB.getConnection();
            String query = "{call proc_insert_Kb(?,?,?,?)}";
            CallableStatement ps = con.prepareCall(query);
            ps.setString(1, maBenhNhan);
            ps.setDate(2, new java.sql.Date(ngayKham.getTime())); 
            ps.setString(3, yeuCau);
            ps.setString(4, tenbs);
            countResult = ps.executeUpdate();   
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return countResult; 
        }
        
        return countResult;
    }
    
    public int ThanhToan(String maBenhNhan)
    {
        int countResult = 0;
        Connection con = null;
        try {
            con = ConnectDB.getConnection();
            String query = "{call proc_update_thanhtoan(?)}";
            CallableStatement ps = con.prepareCall(query);
            ps.setString(1, maBenhNhan);
            countResult = ps.executeUpdate();   
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return countResult; 
        }
        
        return countResult;
    }
}
