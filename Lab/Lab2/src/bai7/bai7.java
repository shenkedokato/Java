package bai7;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class bai7 {
    public static void main(String[] args) { 
        nhapDanhSachChuyenXe();
        xuatDanhSachChuyenXe();
        System.out.println("Tổng doanh thu:");
        System.out.println(tinhTongDoanhThu());
    }
    private static List<ChuyenXe> danhSachChuyenXe=new ArrayList<>();
    public static void nhapDanhSachChuyenXe() {
        try (Scanner scanner = new Scanner(System.in)) {
            int soChuyenXe;
            do {
                System.out.print("Nhap so chuyen xe (khong qua 20): ");
                soChuyenXe = scanner.nextInt();
            } while (soChuyenXe < 0 || soChuyenXe > 20);
   
            for (int i = 0; i < soChuyenXe; i++) {
                System.out.println("Nhap thong tin chuyen xe thu " + (i + 1));
                System.out.print("Loai chuyen xe (1 - Noi thanh, 2 - Ngoai thanh): ");
                int loaiChuyenXe = scanner.nextInt();
                scanner.nextLine();
   
                String maSoChuyen, hoTenTaiXe, soXe;
                double khoiLuongHangHoa, doanhThu;
   
                System.out.print("Nhap ma so chuyen: ");
                maSoChuyen = scanner.nextLine();
   
                System.out.print("Nhap ho ten tai xe: ");
                hoTenTaiXe = scanner.nextLine();
   
                System.out.print("Nhap so xe: ");
                soXe = scanner.nextLine();
   
                System.out.print("Nhap khoi luong hang hoa: ");
                khoiLuongHangHoa = scanner.nextDouble();
   
                if (loaiChuyenXe == 1) {
                    double quangDuongDi;
                    System.out.print("Nhap quang duong di: ");
                    quangDuongDi = scanner.nextDouble();
                    doanhThu = quangDuongDi * 30000;
                    ChuyenNoiThanh chuyenNoiThanh = new ChuyenNoiThanh(maSoChuyen, hoTenTaiXe, soXe, khoiLuongHangHoa, quangDuongDi, doanhThu);
                    danhSachChuyenXe.add(chuyenNoiThanh);
                } else {
                    scanner.nextLine();
                    String noiDen;
                    int soNgayVanChuyen;
                    System.out.print("Nhap noi den: ");
                    noiDen = scanner.nextLine();
   
                    System.out.print("Nhap so ngay van chuyen: ");
                    soNgayVanChuyen = scanner.nextInt();
   
                    doanhThu = soNgayVanChuyen * 50000;
                    ChuyenNgoaiThanh chuyenNgoaiThanh = new ChuyenNgoaiThanh(maSoChuyen, hoTenTaiXe, soXe, khoiLuongHangHoa, noiDen, soNgayVanChuyen, doanhThu);
                    danhSachChuyenXe.add(chuyenNgoaiThanh);
                }
            }
        }
    }
    
    
    
    public static void xuatDanhSachChuyenXe() {
        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            chuyenXe.xuatThongTin();
        }
    }
    public static double tinhTongDoanhThu() {
        double tongDoanhThuNoiThanh = 0;
        double tongDoanhThuNgoaiThanh = 0;
        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            if (chuyenXe instanceof ChuyenNoiThanh) {
                tongDoanhThuNoiThanh += chuyenXe.doanhThu();
            } else if (chuyenXe instanceof ChuyenNgoaiThanh) {
                tongDoanhThuNgoaiThanh += chuyenXe.doanhThu();
            }
        }
        return tongDoanhThuNoiThanh + tongDoanhThuNgoaiThanh;
    }
    public static void inThongTinChuyenXeMaxDoanhThu() {
        double maxDoanhThuNoiThanh = 0;
        double maxDoanhThuNgoaiThanh = 0;
        ChuyenXe chuyenXeMaxNoiThanh = null;
        ChuyenXe chuyenXeMaxNgoaiThanh = null;
    
        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            if (chuyenXe instanceof ChuyenNoiThanh) {
                if (chuyenXe.doanhThu() > maxDoanhThuNoiThanh) {
                    maxDoanhThuNoiThanh = chuyenXe.doanhThu();
                    chuyenXeMaxNoiThanh = chuyenXe;
                }
            } else if (chuyenXe instanceof ChuyenNgoaiThanh) {
                if (chuyenXe.doanhThu() > maxDoanhThuNgoaiThanh) {
                    maxDoanhThuNgoaiThanh = chuyenXe.doanhThu();
                    chuyenXeMaxNgoaiThanh = chuyenXe;
                }
            }
        }
    
        System.out.println("Thong tin chuyen xe co doanh thu cao nhat:");
        if (chuyenXeMaxNoiThanh != null) {
            System.out.println("- Chuyen xe noi thanh: ");
            System.out.println(chuyenXeMaxNoiThanh.toString());
        }
        if (chuyenXeMaxNgoaiThanh != null) {
            System.out.println("- Chuyen xe ngoai thanh: ");
            System.out.println(chuyenXeMaxNgoaiThanh.toString());
        }
    }
    
    
}
