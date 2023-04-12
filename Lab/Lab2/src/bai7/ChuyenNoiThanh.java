package bai7;

import java.util.Scanner;

public class ChuyenNoiThanh extends ChuyenXe {
    private double quangDuongDi;
    public ChuyenNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double khoiLuongHangHoa, double quangDuongDi, double donGia) {
            super(maSoChuyen, hoTenTaiXe, soXe, khoiLuongHangHoa, donGia);
            this.quangDuongDi = quangDuongDi;
        }
        
        public double getQuangDuongDi() {
            return quangDuongDi;  
        }
        
        public void setQuangDuongDi(double quangDuongDi) {
            this.quangDuongDi = quangDuongDi;
        }
        
        @Override
        public void nhapThongTin() {
        try (Scanner scanner = new Scanner(System.in)) {
            super.nhapThongTin();
            System.out.print("Nhap quang duong di: ");
            this.quangDuongDi = scanner.nextDouble();
        }
        }
        
        @Override
        public void xuatThongTin() {
            super.xuatThongTin();
            System.out.println("Quang duong di: " + this.quangDuongDi);
        }
        
        @Override
        public double doanhThu() {
            return this.quangDuongDi * super.getDonGia();
        }
}

