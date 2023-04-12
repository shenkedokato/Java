
package bai4;

import java.util.Scanner;

public class HinhChuNhat {
    private double cd;
    private double cr;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }
    
    public double dienTich(){
        return cr*cd;
    }
    
    public double chuVi(){
        return (cr+cr)*2;
    }
    
    public void ToString(){
        System.out.println("Chieu dai la:"+this.cd);
        System.out.println("Chieu rong la:"+this.cr);
        System.out.println("Dien tich la:"+this.dienTich());
        System.out.println("Chu vi la:"+this.chuVi());
    }
    
    public void Nhap(){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Hay nhap chieu dai:");
            this.cd=in.nextInt();
            System.out.println("Hay nhap chieu rong:");
            this.cr=in.nextInt();
        }
    }
}
