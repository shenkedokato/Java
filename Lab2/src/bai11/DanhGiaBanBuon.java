
package bai11;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class DanhGiaBanBuon extends HangHoa {
    protected String yeuCauKhac; // các yếu tố khác để đánh giá

    // Constructor
    public DanhGiaBanBuon(String maHang, String tenHang, int soLuongTon, double donGia, String yeuCauKhac) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.yeuCauKhac = yeuCauKhac;
    }

    // Getter và Setter
    public String getYeuCauKhac() {
        return yeuCauKhac;
    }

    public void setYeuCauKhac(String yeuCauKhac) {
        this.yeuCauKhac = yeuCauKhac;
    }

    // Phương thức đánh giá mức độ bán buôn cho từng loại hàng
    public String danhGia() {
        Class<? extends HangHoa> cls = this.getClass();

        if (HangDienMay.class == cls) {
            if (getSoLuongTon() < 3) {
                return "Bán được";
            } else {
                return "Khó bán";
            }
        } 
        else if (cls == HangThucPham.class) {
            LocalDate ngayHetHan;
            ngayHetHan = getNgayHetHan();
            LocalDate ngayHienTai = LocalDate.now();
            if (ngayHetHan.isBefore(ngayHienTai) && getSoLuongTon() > 2) {
                return "Khó bán";
            } else {
                return "Bán được";
            }
        } else if (cls == HangGiaDung.class) {
            HangGiaDung hangGD = ;
            LocalDate ngayNhap = hangGD.getNgayNhap();
            LocalDate ngayHienTai = LocalDate.now();
            Period thoiGian;
            thoiGian = Period.between(ngayNhap.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), ngayHienTai);
            int soNgay = thoiGian.getDays();
            if (getSoLuongTon() > 10 && soNgay > 20) {
                return "Bán được";
            } else {
                return "Khó bán";
            }
        } else {
            return "";
        }
    }

}
