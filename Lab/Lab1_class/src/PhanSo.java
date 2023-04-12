package src;

public class PhanSo {
    public int tuSo;
    public int mauSo;
    public PhanSo(){
        tuSo=0;
        mauSo=1;
    }
    public PhanSo(int tuSo,int mauSo){
        this.tuSo=tuSo;
        this.mauSo=mauSo;
    }
    public void rutGon(){
        this.tuSo/=bai3.findGCD(this.tuSo,this.mauSo);
        this.mauSo/=bai3.findGCD(this.tuSo,this.mauSo);
        
    }
    public static PhanSo tong(PhanSo x,PhanSo y){
        PhanSo c=new PhanSo();
        c.tuSo=x.tuSo*y.mauSo+x.mauSo*y.tuSo;
        c.mauSo=x.mauSo*y.mauSo;
        c.rutGon();
        return c;
    }
    public static PhanSo hieu(PhanSo x,PhanSo y){
        PhanSo c=new PhanSo();
        c.tuSo=x.tuSo*y.mauSo-x.mauSo*y.tuSo;
        c.mauSo=x.mauSo*y.mauSo;
        c.rutGon();
        return c;
    }
    public static PhanSo tich(PhanSo x,PhanSo y){
        PhanSo c=new PhanSo();
        c.tuSo=x.tuSo*y.tuSo;
        c.mauSo=x.mauSo*y.mauSo;
        c.rutGon();
        return c;
    }
    public static PhanSo thuong(PhanSo x,PhanSo y){
        PhanSo c=new PhanSo();
        c.tuSo=x.tuSo*y.mauSo;
        c.mauSo=x.mauSo*y.mauSo;
        c.rutGon();
        return c;
    }
}
