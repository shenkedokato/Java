package bai7;

import java.util.Scanner;

public class ChuyenNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgay;

    public ChuyenNgoaiThanh() {
    }

    public ChuyenNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double khoiLuongHangHoa, String noiDen, int soNgay, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, khoiLuongHangHoa, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public void nhapThongTin() {
        try (Scanner scanner = new Scanner(System.in)) {
            super.nhapThongTin();
            System.out.print("Nhap noi den: ");
            this.noiDen = scanner.nextLine();
            System.out.print("Nhap so ngay van chuyen: ");
            this.soNgay = scanner.nextInt();
        }
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Noi den: " + this.noiDen);
        System.out.println("So ngay van chuyen: " + this.soNgay);
    }

    @Override
    public double doanhThu() {
        return this.soNgay * super.getDonGia();
    }


}

