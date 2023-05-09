/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Bean.DanhMuc;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.DatCuoc_Jpanel;
import view.Shop_panel;
import view.Trangchu_panel;

/**
 *
 * @author admin
 */
public class ChuyenManhinh {
    private JPanel Root;
    private String kindeSelected = "";
    
    private List<DanhMuc> listItem = null;

    public ChuyenManhinh(JPanel jpnRoot) {
        this.Root = jpnRoot;
    }
    
    public void setView (JPanel jpnItem, JLabel jlbItem){
        kindeSelected = "TrangChu";
        jpnItem.setBackground(new Color(0,204,51));
        jlbItem.setBackground(new Color(0,204,51));
        
        Root.removeAll();
        Root.setLayout(new BorderLayout());
        Root.add(new Trangchu_panel());
        Root.validate(); 
        Root.repaint();        
    }
    public void setEvent(List<DanhMuc> listItem){
        this.listItem = listItem;
        for(DanhMuc item: listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    class LabelEvent implements MouseListener{
        
        private JPanel node;
        
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "TrangChu":
                    node = new Trangchu_panel();
                    break;     
                case "BatDau":
//                    node = new TrangChuJPane();
                    break;
                case "ChonMap":
//                    node = new QuanLiKhachHangJPane();
                    break;
                case "DatCuoc":
                    node = new DatCuoc_Jpanel();
                    break;
                case "CuaHang":
                    node = new Shop_panel();
                    break;
                case "TaiKhoan":
//                    node = new DatTiecJPane();
                    break;
                default:
//                    node = new TrangChuJPane();
                    break;
            }
            Root.removeAll();
            Root.repaint();
            Root.revalidate();
            
            
            Root.setLayout(new BorderLayout());
            Root.add(node);
//            Root.validate();
            Root.repaint();            
            Root.revalidate();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindeSelected = kind;
            jpnItem.setBackground(new Color(0,204,51));
            jlbItem.setBackground(new Color(0,204,51));
            for(DanhMuc item: listItem){
                if(!kindeSelected.equalsIgnoreCase(item.getKind())){
                    item.getJpn().setBackground(new Color(102,255,204));
                    item.getJpn().setBackground(new Color(102,255,204));
                }   
            }

        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(0,204,51));
            jlbItem.setBackground(new Color(0,204,51));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindeSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color(102,255,204));
                jlbItem.setBackground(new Color(102,255,204));
            }
        }
    
    }
    private void setChangeBackground(String kind){
        for(DanhMuc item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJlb().setBackground(new Color(0,204,51));
                item.getJpn().setBackground(new Color(0,204,51));
            } else {
                item.getJlb().setBackground(new Color(102,255,204));
                item.getJpn().setBackground(new Color(102,255,204));
            }
        } 
    }
    
}
