package bai2;

public abstract class Sach {
    private long maSach;
    private String tenSach;
    private double donGia;
    private int soLuong;
    private String nxb;

    public Sach() {
    }

    public Sach(long maSach, String tenSach, double donGia, int soLuong, String nxb) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nxb = nxb;
    }

    public long getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getNxb() {
        return nxb;
    }

    public void setMaSach(long maSach) {
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }
    
   public void thongTinSach(){
       System.out.println("Thông tin sách:");
       System.out.println("Ma sach:"+this.maSach);
       System.out.println("Ten sach:"+this.tenSach);
       System.out.println("Don gia:"+this.donGia);
       System.out.println("So luong:"+this.soLuong);
       System.out.println("Nha xuat ban:"+this.nxb);
       
   }
   public double thanhTien(){
       return 0;
   }
   
}
