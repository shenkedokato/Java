package bai3;

public class bai3 {
    public static void main(String[] arg) {
		Pointer diem1= new Pointer(1,-2);
		diem1.XuatThongTin();
		Pointer diem2 = new Pointer(2,1);
		diem2.XuatThongTin();
		System.out.println("Khoang cach giua 2 diem la:" + diem1.KhoangCach(diem2));
	}
    
}
