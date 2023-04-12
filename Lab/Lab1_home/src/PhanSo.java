package src;
import java.util.Scanner;
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
    public void nhap(){
        Scanner input=new Scanner(System.in);
        this.tuSo=input.nextInt();
        this.mauSo=input.nextInt();

        
    }
    public void xuat(){
        System.out.print(String.valueOf(tuSo)+""+String.valueOf(mauSo));
        
    }
}
