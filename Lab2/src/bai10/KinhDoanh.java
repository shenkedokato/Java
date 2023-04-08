
package bai10;


public class KinhDoanh extends Dien{
    @Override
    public float thanhTien(){
        if (this.getSlDien()>400)
            return (this.getSlDien()*this.getDonGia()*0.05f);
        else
            return (this.getSlDien()*this.getDonGia());
    }
}
