package bai1;

public class TaiKhoan {
    private long soTK;
    private String tenTK;
    private double soTien;

    public TaiKhoan() {
    }

    public TaiKhoan(long soTK, String tenTK, double soTien) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTien = soTien;
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }
    
    /**
     * 
     */
    public void inTaiKhoan(){
        System.out.println("So tai khoan:"+this.soTK
                          +"\nTen tai khoan:"+this.tenTK
                          +"\nSo tien:"+this.soTien
        );
    }
    
    /**
     * 
     * @return 
     */
    public boolean napTien(long a){
        if(a > 0){
            this.soTien=this.soTien+a;
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @param a
     * @param soTien
     * @return 
     */
    public boolean chuyenKhoan(TaiKhoan a, double soTien){
        if(soTien <= this.soTien && a.soTK != this.soTK && soTien>=0){
            a.soTien=a.soTien+soTien;
            this.soTien=this.soTien-soTien;
            return true;
        }
        return false;
    }
    
    
}
