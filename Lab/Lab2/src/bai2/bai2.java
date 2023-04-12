package bai2;
public class bai2{

public static void main(String[] arg ){
    SachTieuThuyet tthuyet=new SachTieuThuyet(false,1,"sach tieu thuyet",10000,10,"nha xb tieu thuyet");
    SachTrinhTham ttham=new SachTrinhTham(2,2,"sach trinh tham",20000,10,"nha xb trinh tham");
    tthuyet.thongTinSach();
    System.out.println("Thanh tien tieu thuyet:"+tthuyet.thanhTien());
    System.out.println("######################");
    ttham.thongTinSach();
    System.out.println("Thanh tien trinh tham:"+ttham.thanhTien());
} 
}  