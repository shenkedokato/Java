package bai3;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ToolBar extends javax.swing.JFrame {
    public ToolBar() {
        initComponents();
        setTitle("Toolbar");
        setVisible(true);
    }
    
    public ImageIcon setSizeImageIcon(ImageIcon i) {
        Image image = i.getImage();
        Image scaledImage = image.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        return scaledImageIcon;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        btFolder = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btSaveAs = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btPrinter = new javax.swing.JButton();
        btImage = new javax.swing.JButton();
        btFacebook = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btHand = new javax.swing.JButton();
        btPointer = new javax.swing.JButton();
        btCamera = new javax.swing.JButton();
        btPen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        ImageIcon scaledImageIcon1 = setSizeImageIcon(new ImageIcon("images/folder.png"));
        btFolder.setIcon(scaledImageIcon1);
        btFolder.setFocusable(false);
        btFolder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFolder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFolderActionPerformed(evt);
            }
        });
        jToolBar1.add(btFolder);

        ImageIcon scaledImageIcon2 = setSizeImageIcon(new ImageIcon("images/save.png"));
        btSave.setIcon(scaledImageIcon2);
        btSave.setFocusable(false);
        btSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btSave);

        ImageIcon scaledImageIcon3 = setSizeImageIcon(new ImageIcon("images/saveas.png"));
        btSaveAs.setIcon(scaledImageIcon3);
        btSaveAs.setFocusable(false);
        btSaveAs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSaveAs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveAsActionPerformed(evt);
            }
        });
        jToolBar1.add(btSaveAs);
        jToolBar1.add(filler1);
        jToolBar1.add(filler2);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.add(jSeparator1);
        jToolBar1.add(jSeparator2);

        ImageIcon scaledImageIcon4 = setSizeImageIcon(new ImageIcon("images/printer.png"));
        btPrinter.setIcon(scaledImageIcon4);
        btPrinter.setFocusable(false);
        btPrinter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPrinter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPrinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrinterActionPerformed(evt);
            }
        });
        jToolBar1.add(btPrinter);

        ImageIcon scaledImageIcon5 = setSizeImageIcon(new ImageIcon("images/img.png"));
        btImage.setIcon(scaledImageIcon5);
        btImage.setFocusable(false);
        btImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btImage.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImageActionPerformed(evt);
            }
        });
        jToolBar1.add(btImage);

        ImageIcon scaledImageIcon6 = setSizeImageIcon(new ImageIcon("images/facebook.png"));
        btFacebook.setIcon(scaledImageIcon6);
        btFacebook.setFocusable(false);
        btFacebook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFacebook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFacebookActionPerformed(evt);
            }
        });
        jToolBar1.add(btFacebook);
        jToolBar1.add(jSeparator4);
        jToolBar1.add(jSeparator6);

        ImageIcon scaledImageIcon7 = setSizeImageIcon(new ImageIcon("images/hand.png"));
        btHand.setIcon(scaledImageIcon7);
        btHand.setFocusable(false);
        btHand.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btHand.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btHand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHandActionPerformed(evt);
            }
        });
        jToolBar1.add(btHand);

        ImageIcon scaledImageIcon8 = setSizeImageIcon(new ImageIcon("images/pointer.png"));
        btPointer.setIcon(scaledImageIcon8);
        btPointer.setFocusable(false);
        btPointer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPointer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPointer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPointerActionPerformed(evt);
            }
        });
        jToolBar1.add(btPointer);

        ImageIcon scaledImageIcon9 = setSizeImageIcon(new ImageIcon("images/camera.png"));
        btCamera.setIcon(scaledImageIcon9);
        btCamera.setFocusable(false);
        btCamera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCamera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCameraActionPerformed(evt);
            }
        });
        jToolBar1.add(btCamera);

        ImageIcon scaledImageIcon10 = setSizeImageIcon(new ImageIcon("images/pen.png"));
        btPen.setIcon(scaledImageIcon10);
        btPen.setFocusable(false);
        btPen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPenActionPerformed(evt);
            }
        });
        jToolBar1.add(btPen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFolderActionPerformed
        JOptionPane.showMessageDialog(null, "Mở Folder", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btFolderActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        JOptionPane.showMessageDialog(null, "Lưu File", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btSaveActionPerformed

    private void btSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveAsActionPerformed
        JOptionPane.showMessageDialog(null, "Lưu lại File", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btSaveAsActionPerformed

    private void btPrinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrinterActionPerformed
        JOptionPane.showMessageDialog(null, "Mở chức năng in", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btPrinterActionPerformed

    private void btImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImageActionPerformed
        JOptionPane.showMessageDialog(null, "Mở chức năng chèn hình ảnh", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btImageActionPerformed

    private void btFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFacebookActionPerformed
        JOptionPane.showMessageDialog(null, "Mở Facebook", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btFacebookActionPerformed

    private void btHandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHandActionPerformed
        JOptionPane.showMessageDialog(null, "Chuyển sang chức năng kéo bằng chuột", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btHandActionPerformed

    private void btPointerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPointerActionPerformed
        JOptionPane.showMessageDialog(null, "Chuyển sang con trỏ chuột", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btPointerActionPerformed

    private void btCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCameraActionPerformed
        JOptionPane.showMessageDialog(null, "Chụp màn hình", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btCameraActionPerformed

    private void btPenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPenActionPerformed
        JOptionPane.showMessageDialog(null, "Chuyển sang chế độ viết bằng chuột", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btPenActionPerformed

    
    
    
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCamera;
    private javax.swing.JButton btFacebook;
    private javax.swing.JButton btFolder;
    private javax.swing.JButton btHand;
    private javax.swing.JButton btImage;
    private javax.swing.JButton btPen;
    private javax.swing.JButton btPointer;
    private javax.swing.JButton btPrinter;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btSaveAs;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
