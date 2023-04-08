
package bai10;

import java.util.Scanner;

public class Dien {
    private String maKH;
    private String tenKH;
    private int ngHD;
    private int thHD;
    private int namHD;
    private float slDien;
    private float donGia;

    public Dien() {
    }

    public Dien(String maKH, String tenKH, int ngHD, int thHD, int namHD, float slDien, float donGia) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngHD = ngHD;
        this.thHD = thHD;
        this.namHD = namHD;
        this.slDien = slDien;
        this.donGia = donGia;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getNgHD() {
        return ngHD;
    }

    public void setNgHD(int ngHD) {
        this.ngHD = ngHD;
    }

    public int getThHD() {
        return thHD;
    }

    public void setThHD(int thHD) {
        this.thHD = thHD;
    }

    public int getNamHD() {
        return namHD;
    }

    public void setNamHD(int namHD) {
        this.namHD = namHD;
    }

    public float getSlDien() {
        return slDien;
    }

    public void setSlDien(float slDien) {
        this.slDien = slDien;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
    public float thanhTien(){
        return 0;
    }
    
    public void nhap(){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Ma khach hang:");
            this.maKH=in.nextLine();
            System.out.println("Ten khach hang:");
            this.tenKH=in.nextLine();
            System.out.println("Ngay thang nam:");
            this.ngHD=in.nextInt();
            this.thHD=in.nextInt();
            this.namHD=in.nextInt();
            System.out.println("So luong dien:");
            this.slDien=in.nextFloat();
            System.out.println("Don gia:");
            this.donGia=in.nextInt();
        }        
    }
    
    public void Xuat(){
        System.out.println("Ma khach hang:"+this.maKH);
        System.out.println("Ten khach hang:"+this.tenKH);
        System.out.println("So luong dien:"+this.slDien);
        System.out.println("Thanh tien:"+this.thanhTien());
        System.out.println("-----------------------------");
    }
}


