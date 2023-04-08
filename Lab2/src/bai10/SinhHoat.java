
package bai10;

import java.util.Scanner;


public class SinhHoat extends Dien {
    private float dinhMuc;

    public SinhHoat() {
    }

    public SinhHoat(float dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public SinhHoat(float dinhMuc, String maKH, String tenKH, int ngHD, int thHD, int namHD, float slDien, float donGia) {
        super(maKH, tenKH, ngHD, thHD, namHD, slDien, donGia);
        this.dinhMuc = dinhMuc;
    }

    public float getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(float dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    
    @Override
    public float thanhTien(){
        if(this.getSlDien()<=this.dinhMuc)
            return (this.getSlDien()*this.getDonGia());
        else
            return (this.getSlDien()*this.getDonGia()*this.dinhMuc+((this.getSlDien()-this.dinhMuc)*this.getDonGia()*2));
    }
    
    @Override
    public void nhap(){
        try (Scanner in = new Scanner(System.in)) {
            super.nhap();
            System.out.println("Dinh muc:");
            this.dinhMuc=in.nextFloat();
        } 
    }  
}
