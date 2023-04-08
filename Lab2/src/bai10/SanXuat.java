package bai10;

import java.util.Scanner;

public class SanXuat extends Dien {
    private int loaiDien;

    public SanXuat() {
    }

    public SanXuat(int loaiDien) {
        this.loaiDien = loaiDien;
    }

    public SanXuat(int loaiDien, String maKH, String tenKH, int ngHD, int thHD, int namHD, float slDien, float donGia) {
        super(maKH, tenKH, ngHD, thHD, namHD, slDien, donGia);
        this.loaiDien = loaiDien;
    }

    public int getLoaiDien() {
        return loaiDien;
    }

    public void setLoaiDien(int loaiDien) {
        this.loaiDien = loaiDien;
    }
    
    @Override
    public float thanhTien(){
        if(this.loaiDien==2 && this.getSlDien()>200)
            return (this.getSlDien()*this.getDonGia()*0.98f);
        else if(this.loaiDien==2 && this.getSlDien()<=200)
            return (this.getSlDien()*this.getDonGia());    
        if (this.loaiDien==3 && this.getSlDien()>150)
            return (this.getSlDien()*this.getDonGia());
        else 
            return (this.getSlDien()*this.getDonGia()*0.97f);            
    }
    
    @Override
    public void nhap(){
        try (Scanner in = new Scanner(System.in)) {
            super.nhap();
            System.out.println("Loai dien (2 pha hoac 3 pha):");
            this.loaiDien=in.nextInt();
        }
    }
}
