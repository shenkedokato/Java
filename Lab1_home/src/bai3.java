package src;

public class bai3 {

    public static int findGCD(int x, int y) {
        
        if(y== 0){
            return x;
        }
        return findGCD(y, x%y);
    }
    public static void main(String[]arg){
        PhanSo a=new PhanSo();
        a.nhap();
        a.rutGon();
        a.xuat();
    }
    
}
