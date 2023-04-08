package bai7;

import java.util.Scanner;

public abstract class ChuyenXe {
    protected String maSoChuyen;
    protected String hoTenTaiXe;
    protected String soXe;
    protected double khoiLuongHangHoa;
    protected double donGia;
    public ChuyenXe() {
    }
    
    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double khoiLuongHangHoa, double donGia) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.khoiLuongHangHoa = khoiLuongHangHoa;
        this.donGia = donGia;
    }
    
    public String getMaSoChuyen() {
        return maSoChuyen;
    }
    
    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }
    
    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }
    
    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }
    
    public String getSoXe() {
        return soXe;
    }
    
    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }
    
    public double getKhoiLuongHangHoa() {
        return khoiLuongHangHoa;
    }
    
    public void setKhoiLuongHangHoa(double khoiLuongHangHoa) {
        this.khoiLuongHangHoa = khoiLuongHangHoa;
    }
    
    public double getDonGia() {
        return donGia;
    }
    
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhapThongTin() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập mã số chuyến: ");
            maSoChuyen = sc.nextLine();
            System.out.print("Nhập họ tên tài xế: ");
            hoTenTaiXe = sc.nextLine();
            System.out.print("Nhập số xe: ");
            soXe = sc.nextLine();
            System.out.print("Nhập khối lượng hàng hóa: ");
            khoiLuongHangHoa = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập doanh thu: ");
            donGia = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
    
    public void xuatThongTin() {
        System.out.println("Mã số chuyến: " + maSoChuyen);
        System.out.println("Họ tên tài xế: " + hoTenTaiXe);
        System.out.println("Số xe: " + soXe);
        System.out.println("Khối lượng hàng hóa: " + khoiLuongHangHoa);
        System.out.println("Doanh thu: " + donGia);
    }
    public abstract double doanhThu();
    
}    