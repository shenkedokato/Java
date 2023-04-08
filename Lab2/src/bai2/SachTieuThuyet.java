package bai2;

public class SachTieuThuyet extends Sach {
    private boolean tinhTrang;

    public SachTieuThuyet() {
    }

    public SachTieuThuyet(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public SachTieuThuyet(boolean tinhTrang, long maSach, String tenSach, double donGia, int soLuong, String nxb) {
        super(maSach, tenSach, donGia, soLuong, nxb);
        this.tinhTrang = tinhTrang;
    }
    
    @Override
    public void thongTinSach(){
        super.thongTinSach();
        System.out.println("Tinh trang:"+this.tinhTrang);
    }
    
    @Override
    public double thanhTien(){
        if(this.tinhTrang==true)
            return super.getSoLuong()*super.getDonGia();
        else
            return super.getSoLuong()*super.getDonGia()*0.2;
    }
    
}
