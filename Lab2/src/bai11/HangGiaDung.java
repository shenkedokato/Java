package bai11;

import java.time.LocalDate;
import java.util.Date;

public class HangGiaDung extends HangHoa {
    protected String nhaSanXuat;
    protected LocalDate ngayNhap;
    protected String loai;

    public HangGiaDung() {
        super("", "", 0, 0);
        this.nhaSanXuat = "";
        this.ngayNhap = LocalDate.now();
        this.loai = "";
    }

    public HangGiaDung(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, LocalDate ngayNhap, String loai) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhap = ngayNhap;
        this.loai = loai;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void xuatThongTinHang() {
        super.xuatThongTinHang();
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Ngày nhập: " + ngayNhap);
        System.out.println("Loại: " + loai);
    }

    @Override
    public double thanhTien() {
        double VAT = 0.1;
        double thanhTien = getSoLuongTon() * getDonGia() * (1 + VAT);
        setSoLuongTon(getSoLuongTon() - 1);
        return thanhTien;
    }

    // Phương thức đánh giá mức độ bán buôn của hàng gia dụng
    public boolean danhGiaBanBuon() {
        int soLuongTon = getSoLuongTon();
        LocalDate ngayNhap = getNgayNhap();
        Date dateNgayNhap = java.sql.Date.valueOf(ngayNhap); // chuyển từ LocalDate sang Date
        Date dateNgayHienTai = new Date(); // sử dụng thư viện Date để lấy thời gian hiện tại
        long soNgayTrongKho = (dateNgayHienTai.getTime() - dateNgayNhap.getTime()) / (24 * 60 * 60 * 1000); // tính số ngày trong kho
        if (soLuongTon > 10 && soNgayTrongKho > 20) {
            return true;
        } else {
            return false;
        }
    }
}

