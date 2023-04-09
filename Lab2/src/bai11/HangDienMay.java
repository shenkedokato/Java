package bai11;
public class HangDienMay extends HangHoa {
    protected String thuongHieu;
    protected String loaiMay;
    protected int thoiGianBaoHanh;
   
    public HangDienMay() {
        super("", "", 0, 0);
        this.thuongHieu = "";
        this.loaiMay = "";
        this.thoiGianBaoHanh = 0;
    }
    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, String thuongHieu, String loaiMay,
        int thoiGianBaoHanh) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thuongHieu = thuongHieu;
        this.loaiMay = loaiMay;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getLoaiMay() {
        return loaiMay;
    }

    public void setLoaiMay(String loaiMay) {
        this.loaiMay = loaiMay;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void xuatThongTin() {
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Số lượng tồn: " + soLuongTon);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Thương hiệu: " + thuongHieu);
        System.out.println("Loại máy: " + loaiMay);
        System.out.println("Thời gian bảo hành: " + thoiGianBaoHanh + " tháng");
    }

    @Override
    public double thanhTien() {
        double VAT = 0.1;
        double thanhTien = soLuongTon * donGia * (1 + VAT);
        soLuongTon -= soLuongTon;
        return thanhTien;
    }
      public boolean danhGiaBanBuon() {
        if (soLuongTon < 3) {
            return true;
        }
        return false;
    }

}
