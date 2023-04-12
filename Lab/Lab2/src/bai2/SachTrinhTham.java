package bai2;


public class SachTrinhTham extends Sach {
    private float thue;

    public SachTrinhTham(float thue) {
        this.thue = thue;
    }

    public SachTrinhTham(float thue, long maSach, String tenSach, double donGia, int soLuong, String nxb) {
        super(maSach, tenSach, donGia, soLuong, nxb);
        this.thue = thue;
    }
    
    @Override
    public void thongTinSach(){
        super.thongTinSach();
        System.out.println("Thue:"+this.thue);
    }
    
    @Override
    public double thanhTien(){
        return super.getSoLuong()*super.getDonGia()*this.thue;    
    }
}
