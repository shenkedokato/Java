/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import Connection.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MrTo
 */
public class QuanLy {
    
    public void TaoTable (JTable sanpham){
        DefaultTableModel model  = (DefaultTableModel) sanpham.getModel();
        try ( Connection con = ConnectDB.getConnection()) {
            String SQL = "SELECT * FROM SANPHAM";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            ResultSetMetaData RSMD = rs.getMetaData();
            int CC = RSMD.getColumnCount();
            
            model.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int ii = 1; ii <= CC; ii++) {                  
                    v2.add(rs.getString("masp"));                                     
                    v2.add(rs.getString("tensp"));
                    v2.add(rs.getString("gia"));

                }
                model.addRow(v2);

            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }    
            
    }
    
    public int themSanPham(JTable sanpham, String maSP, 
            String tenSP, String gia)
    {
        
        int countResult = 0;
        Connection con = null;
        try {
            
            con = ConnectDB.getConnection();
            String query = "INSERT INTO SANPHAM VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, maSP);
            ps.setString(2, tenSP);      
            ps.setString(3,gia);
            countResult = ps.executeUpdate();
            DefaultTableModel model  = (DefaultTableModel) sanpham.getModel();

                String row[] = new String [3];
                row [0] = maSP;
                row [1] = tenSP;
                row [2] = gia;
                model.addRow(row);
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return countResult; 
        }
        
        return countResult;
    }
    
    public void xoaSanPham(JTable sanpham, String masp){
        DefaultTableModel model  = (DefaultTableModel) sanpham.getModel();

        int indexTB = sanpham.getSelectedRow();
        Connection con = null;
        try {
            con = ConnectDB.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa", "Xóa dữ liệu", JOptionPane.YES_NO_OPTION );
        if (ret  == JOptionPane.YES_OPTION)
        {
            if (indexTB < model.getRowCount() && indexTB >= 0)
            {
                model.removeRow(indexTB);
            }
            String str = "Delete from sanpham where masp = ?";
            try {
                PreparedStatement pst = con.prepareStatement(str);
                pst.setString(1, masp);
                pst.executeUpdate();
                con.close();
                        } catch (SQLException ex) {
                Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
    }
    
    public void suaSanPham(JTable sanpham, String masp, String tensp, String gia){
        DefaultTableModel model  = (DefaultTableModel) sanpham.getModel();

        int indexTB = sanpham.getSelectedRow();
        Connection con = null;
        try {
            con = ConnectDB.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa dữ liệu", "Sửa dữ liệu", JOptionPane.YES_NO_OPTION );
        if (ret == JOptionPane.YES_OPTION){
            String sql = "Update sanpham set tensp =?, gia = ? where masp = ?";
            try {
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, tensp);
                pst.setString(2, gia);
                pst.setString(3, masp);
                pst.executeUpdate();
                if (indexTB < model.getRowCount() && indexTB >= 0) {
                    model.setValueAt(tensp, indexTB, 1);
                    model.setValueAt(gia, indexTB, 2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
}
