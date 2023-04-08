
package bai5;


public class SinhVien {
    private int mssv;
    private String hoTen;
    private float LT;
    private float TH;

    public SinhVien() {
    }

    public SinhVien(int mssv, String hoTen, float LT, float TH) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.LT = LT;
        this.TH = TH;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getLT() {
        return LT;
    }

    public void setLT(float LT) {
        this.LT = LT;
    }

    public float getTH() {
        return TH;
    }

    public void setTH(float TH) {
        this.TH = TH;
    }
    
    public float diemTB(){
        return ((this.LT+this.TH)/2);
    }
    
    
    public void ToString(){
        System.out.println("Ma so sinh vien:"+this.mssv);
        System.out.println("Ho va ten:"+this.hoTen);
        System.out.println("Diem ly thuyet: "+this.LT);
        System.out.println("Diem thuc hanh: "+this.TH);
        System.out.println("Diem trung binh:"+this.diemTB());
        System.out.println("-----------------------------------");
    }
}
