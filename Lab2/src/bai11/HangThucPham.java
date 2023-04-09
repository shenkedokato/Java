
package bai11;

import java.time.LocalDate;


public class HangThucPham extends HangHoa {
    protected LocalDate ngaySanXuat;
    protected LocalDate ngayHetHan;
    protected String nhaCungCap;
    
    public HangThucPham() {
        super("", "", 0, 0);
        this.ngaySanXuat = null;
        this.ngayHetHan = null;
        this.nhaCungCap = "";
    }
    
    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public void inThongTin() {
        super.inThongTin();
        System.out.println("Ngày sản xuất: " + ngaySanXuat);
        System.out.println("Ngày hết hạn: " + ngayHetHan);
        System.out.println("Nhà cung cấp: " + nhaCungCap);
    }

    @Override
    public double thanhTien() {
        double tongTien = super.thanhTien();
        if (ngayHetHan.isBefore(LocalDate.now()) && soLuongTon > 2) {
            tongTien *= 0.95;
        }
        soLuongTon--;
        return tongTien;
    }

    public void xuatThongTin() {
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten hang: " + tenHang);
        System.out.println("So luong ton: " + soLuongTon);
        System.out.println("Don gia: " + donGia);
        System.out.println("Ngay san xuat: " + ngaySanXuat);
        System.out.println("Ngay het han: " + ngayHetHan);
        System.out.println("Nha cung cap: " + nhaCungCap);
    }
      public String danhGiaBanBuon() {
        if (ngayHetHan.isBefore(LocalDate.now()) && soLuongTon > 2) {
            return "Khó bán";
        } else {
            return "Dễ bán";
        }
    }
    }
