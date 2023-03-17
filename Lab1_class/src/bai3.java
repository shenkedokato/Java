package src;
public class bai3 {
    public static int findGCD(int x, int y) {
        
        if(y== 0){
            return x;
        }
        return findGCD(y, x%y);
    }
    public static void main(String [] arg){
        PhanSo a=new PhanSo();
        PhanSo b=new PhanSo();
        PhanSo ketQua1=PhanSo.tong(a,b);
        System.out.println(ketQua1);
        PhanSo ketQua2=PhanSo.hieu(a,b);
        System.out.println(ketQua2);
        PhanSo ketQua3=PhanSo.tich(a,b);
        System.out.println(ketQua3);
        PhanSo ketQua4=PhanSo.thuong(a,b);
        System.out.println(ketQua4);

    }
}
