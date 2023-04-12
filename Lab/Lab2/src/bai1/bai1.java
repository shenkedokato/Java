package bai1;
public class bai1{
    public static void main(String[] arg){
        TaiKhoan a = new TaiKhoan(3138431,"nguyen van B",2);
        TaiKhoan b = new TaiKhoan(2313548,"nguyen van A",3);
        System.out.println("tai khoan a:");
        a.inTaiKhoan();
        a.napTien(1);
        System.out.println("sau khi nap tien:");
        a.inTaiKhoan();
        
        System.out.println("tai khoan b:");
        b.inTaiKhoan();
        a.chuyenKhoan(b, 1);
        
        System.out.println("sau khi chuyen tien:");
        a.inTaiKhoan();
        b.inTaiKhoan();        
    }
}