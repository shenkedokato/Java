package bai11;

public class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected int soLuongTon;
    protected double donGia;

    public HangHoa(){
        this.maHang = "";
        this.tenHang = "";
        this.soLuongTon = 0;
        this.donGia = 0;
    }
    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Ma hang: " + maHang + "\nTen hang: " + tenHang + "\nSo luong ton: " + soLuongTon + "\nDon gia: " + donGia;
    }

    public double thanhTien() {
        return soLuongTon * donGia * 1.1;
    }   

    public void xuatThongTinHang() {
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten hang: " + tenHang);
        System.out.println("So luong ton: " + soLuongTon);
        System.out.println("Don gia: " + donGia);
    }

    public void inThongTin() {
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten hang: " + tenHang);
        System.out.println("So luong ton: " + soLuongTon);
        System.out.println("Don gia: " + donGia);
        System.out.println("Thanh tien: " + thanhTien());
    }

   
}
