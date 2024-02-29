/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Bean.DanhMuc;
import controller.ChuyenManhinh;
import controller.Controller_Datcuoc;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        init();
        this.setTitle("Racing Game");
        setResizable(true);
        setVisible(true);
        ChuyenManhinh controller = new ChuyenManhinh(Trangchu_form);
        controller.setView(jpn_TrangChu, jlabel_TrangChu);
        
        List<DanhMuc> listItem = new ArrayList<>();
        listItem.add(new DanhMuc("TrangChu",jpn_TrangChu,jlabel_TrangChu));
        listItem.add(new DanhMuc("BatDau",jpn_BatDau,jlabel_BatDau));
        listItem.add(new DanhMuc("ChonMap",jpn_ChonMap,jlabel_ChonMap));
        listItem.add(new DanhMuc("DatCuoc",jpn_DatCuoc,jlabel_DatCuoc));
        listItem.add(new DanhMuc("CuaHang",jpn_CuaHang,jlabel_CuaHang));
        listItem.add(new DanhMuc("TaiKhoan",jpn_TaiKhoan,jlabel_TaiKhoan));
        controller.setEvent(listItem);
    }
    private void init() {

        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Button_Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpn_TrangChu = new javax.swing.JPanel();
        jlabel_TrangChu = new javax.swing.JLabel();
        jpn_CuaHang = new javax.swing.JPanel();
        jlabel_CuaHang = new javax.swing.JLabel();
        jpn_DatCuoc = new javax.swing.JPanel();
        jlabel_DatCuoc = new javax.swing.JLabel();
        jpn_ChonMap = new javax.swing.JPanel();
        jlabel_ChonMap = new javax.swing.JLabel();
        jpn_TaiKhoan = new javax.swing.JPanel();
        jlabel_TaiKhoan = new javax.swing.JLabel();
        jpn_BatDau = new javax.swing.JPanel();
        jlabel_BatDau = new javax.swing.JLabel();
        Trangchu_form = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(24, 34, 56));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        Button_Exit.setBackground(new java.awt.Color(255, 51, 51));
        Button_Exit.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Button_Exit.setForeground(new java.awt.Color(0, 0, 0));
        Button_Exit.setText("Thoát trò chơi");
        Button_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Engravers MT", 3, 11)); // NOI18N
        jLabel1.setText("Nhom 8");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/racing.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jpn_TrangChu.setBackground(new java.awt.Color(102, 255, 204));

        jlabel_TrangChu.setBackground(new java.awt.Color(0, 204, 51));
        jlabel_TrangChu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlabel_TrangChu.setForeground(new java.awt.Color(0, 0, 0));
        jlabel_TrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jlabel_TrangChu.setText("Trang chủ");

        javax.swing.GroupLayout jpn_TrangChuLayout = new javax.swing.GroupLayout(jpn_TrangChu);
        jpn_TrangChu.setLayout(jpn_TrangChuLayout);
        jpn_TrangChuLayout.setHorizontalGroup(
            jpn_TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_TrangChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_TrangChuLayout.setVerticalGroup(
            jpn_TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_TrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jpn_CuaHang.setBackground(new java.awt.Color(102, 255, 204));

        jlabel_CuaHang.setBackground(new java.awt.Color(153, 255, 204));
        jlabel_CuaHang.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlabel_CuaHang.setForeground(new java.awt.Color(0, 0, 0));
        jlabel_CuaHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Shop.png"))); // NOI18N
        jlabel_CuaHang.setText("Cửa hàng");

        javax.swing.GroupLayout jpn_CuaHangLayout = new javax.swing.GroupLayout(jpn_CuaHang);
        jpn_CuaHang.setLayout(jpn_CuaHangLayout);
        jpn_CuaHangLayout.setHorizontalGroup(
            jpn_CuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_CuaHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_CuaHangLayout.setVerticalGroup(
            jpn_CuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_CuaHang, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jpn_DatCuoc.setBackground(new java.awt.Color(102, 255, 204));

        jlabel_DatCuoc.setBackground(new java.awt.Color(153, 255, 204));
        jlabel_DatCuoc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlabel_DatCuoc.setForeground(new java.awt.Color(0, 0, 0));
        jlabel_DatCuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuoc.png"))); // NOI18N
        jlabel_DatCuoc.setText("Đặt cược");

        javax.swing.GroupLayout jpn_DatCuocLayout = new javax.swing.GroupLayout(jpn_DatCuoc);
        jpn_DatCuoc.setLayout(jpn_DatCuocLayout);
        jpn_DatCuocLayout.setHorizontalGroup(
            jpn_DatCuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_DatCuoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_DatCuocLayout.setVerticalGroup(
            jpn_DatCuocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_DatCuoc, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jpn_ChonMap.setBackground(new java.awt.Color(102, 255, 204));

        jlabel_ChonMap.setBackground(new java.awt.Color(153, 255, 204));
        jlabel_ChonMap.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlabel_ChonMap.setForeground(new java.awt.Color(0, 0, 0));
        jlabel_ChonMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/map.png"))); // NOI18N
        jlabel_ChonMap.setText("Chọn map");

        javax.swing.GroupLayout jpn_ChonMapLayout = new javax.swing.GroupLayout(jpn_ChonMap);
        jpn_ChonMap.setLayout(jpn_ChonMapLayout);
        jpn_ChonMapLayout.setHorizontalGroup(
            jpn_ChonMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_ChonMap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_ChonMapLayout.setVerticalGroup(
            jpn_ChonMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_ChonMap, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jpn_TaiKhoan.setBackground(new java.awt.Color(102, 255, 204));

        jlabel_TaiKhoan.setBackground(new java.awt.Color(153, 255, 204));
        jlabel_TaiKhoan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlabel_TaiKhoan.setForeground(new java.awt.Color(0, 0, 0));
        jlabel_TaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/account.png"))); // NOI18N
        jlabel_TaiKhoan.setText("Tài khoản");

        javax.swing.GroupLayout jpn_TaiKhoanLayout = new javax.swing.GroupLayout(jpn_TaiKhoan);
        jpn_TaiKhoan.setLayout(jpn_TaiKhoanLayout);
        jpn_TaiKhoanLayout.setHorizontalGroup(
            jpn_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_TaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_TaiKhoanLayout.setVerticalGroup(
            jpn_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jpn_BatDau.setBackground(new java.awt.Color(102, 255, 204));

        jlabel_BatDau.setBackground(new java.awt.Color(153, 255, 204));
        jlabel_BatDau.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlabel_BatDau.setForeground(new java.awt.Color(0, 0, 0));
        jlabel_BatDau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        jlabel_BatDau.setText("Bắt đầu");

        javax.swing.GroupLayout jpn_BatDauLayout = new javax.swing.GroupLayout(jpn_BatDau);
        jpn_BatDau.setLayout(jpn_BatDauLayout);
        jpn_BatDauLayout.setHorizontalGroup(
            jpn_BatDauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_BatDau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_BatDauLayout.setVerticalGroup(
            jpn_BatDauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_BatDau, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpn_TrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_CuaHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_DatCuoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_ChonMap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_TaiKhoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_BatDau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_Exit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jpn_TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpn_BatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpn_ChonMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpn_DatCuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpn_CuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpn_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Button_Exit)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Trangchu_form.setBackground(new java.awt.Color(24, 34, 56));

        javax.swing.GroupLayout Trangchu_formLayout = new javax.swing.GroupLayout(Trangchu_form);
        Trangchu_form.setLayout(Trangchu_formLayout);
        Trangchu_formLayout.setHorizontalGroup(
            Trangchu_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        Trangchu_formLayout.setVerticalGroup(
            Trangchu_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Trangchu_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Trangchu_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Button_ExitActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Exit;
    private javax.swing.JPanel Trangchu_form;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlabel_BatDau;
    private javax.swing.JLabel jlabel_ChonMap;
    private javax.swing.JLabel jlabel_CuaHang;
    private javax.swing.JLabel jlabel_DatCuoc;
    private javax.swing.JLabel jlabel_TaiKhoan;
    private javax.swing.JLabel jlabel_TrangChu;
    private javax.swing.JPanel jpn_BatDau;
    private javax.swing.JPanel jpn_ChonMap;
    private javax.swing.JPanel jpn_CuaHang;
    private javax.swing.JPanel jpn_DatCuoc;
    private javax.swing.JPanel jpn_TaiKhoan;
    private javax.swing.JPanel jpn_TrangChu;
    // End of variables declaration//GEN-END:variables

    
}