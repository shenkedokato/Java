package bai11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<HangHoa> dsHangHoa = new ArrayList<>();

        int luachon;
        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Nhập thông tin hàng điện máy");
            System.out.println("2. Nhập thông tin hàng thực phẩm");
            System.out.println("3. Hiển thị thông tin tất cả hàng hóa");
            System.out.println("4. Tính giá trị tổng số lượng tồn kho");
            System.out.println("5. Tính giá trị tổng số lượng tồn kho của hàng điện máy");
            System.out.println("6. Tính giá trị tổng số lượng tồn kho của hàng thực phẩm");
            System.out.println("0. Thoát chương trình");

            System.out.print("Mời bạn chọn chức năng: ");
            luachon = sc.nextInt();
            sc.nextLine();

            switch (luachon) {
                case 1:
                    System.out.print("Nhập mã hàng: ");
                    String maHangDM = sc.nextLine();
                    System.out.print("Nhập tên hàng: ");
                    String tenHangDM = sc.nextLine();
                    System.out.print("Nhập số lượng tồn: ");
                    int soLuongTonDM = sc.nextInt();
                    System.out.print("Nhập đơn giá: ");
                    double donGiaDM = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhập thương hiệu: ");
                    String thuongHieu = sc.nextLine();
                    System.out.print("Nhập loại máy: ");
                    String loaiMay = sc.nextLine();
                    System.out.print("Nhập thời gian bảo hành (tháng): ");
                    int thoiGianBaoHanh = sc.nextInt();
                    HangDienMay dm = new HangDienMay(maHangDM, tenHangDM, soLuongTonDM, donGiaDM, thuongHieu, loaiMay, thoiGianBaoHanh);
                    dsHangHoa.add(dm);
                    break;
                case 2:
                    System.out.print("Nhập mã hàng: ");
                    String maHangTP = sc.nextLine();
                    System.out.print("Nhập tên hàng: ");
                    String tenHangTP = sc.nextLine();
                    System.out.print("Nhập số lượng tồn: ");
                    int soLuongTonTP = sc.nextInt();
                    System.out.print("Nhập đơn giá: ");
                    double donGiaTP = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhập ngày sản xuất (yyyy-mm-dd): ");
                    LocalDate ngaySX = LocalDate.parse(sc.nextLine());
                    System.out.print("Nhập ngày hết hạn (yyyy-mm-dd): ");
                    LocalDate ngayHH = LocalDate.parse(sc.nextLine());
                    System.out.print("Nhập tên nhà cung cấp: ");
                    String nhaCungCap = sc.nextLine();
                    HangThucPham tp = new HangThucPham(maHangTP, tenHangTP, soLuongTonTP, donGiaTP, ngaySX, ngayHH, nhaCungCap);
                    dsHangHoa.add(tp);
                    break;
        
                case 3:
                    System.out.println("Danh sách hàng hóa:");
                    for (HangHoa hh : dsHangHoa) {
                        System.out.println(hh.toString());
                    }
                    break;
        
                case 4:
                    int tongSoLuongTonKho = 0;
                    for (HangHoa hh : dsHangHoa) {
                        tongSoLuongTonKho += hh.getSoLuongTon();
                    }
                    System.out.println("Tổng số lượng tồn kho: " + tongSoLuongTonKho);
                    break;
        
                case 5:
                    int tongSoLuongTonDM = 0;
                    for (HangHoa hh : dsHangHoa) {
                        if (hh instanceof HangDienMay) {
                            tongSoLuongTonDM += hh.getSoLuongTon();
                        }
                    }
                    System.out.println("Tổng số lượng tồn kho của hàng điện máy: " + tongSoLuongTonDM);
                    break;
        
                case 6:
                    int tongSoLuongTonTP = 0;
                    for (HangHoa hh : dsHangHoa) {
                        if (hh instanceof HangThucPham) {
                            tongSoLuongTonTP += hh.getSoLuongTon();
                        }
                    }
                    System.out.println("Tổng số lượng tồn kho của hàng thực phẩm: " + tongSoLuongTonTP);
                    break;
        
                case 0:
                    System.out.println("Chương trình kết thúc.");
                    break;
        
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (luachon != 0);
        
        sc.close();
    }
  }
 

