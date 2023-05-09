package bai5;

public class bai5 {

	public static void main(String[] args) {
        TuDien TD = new TuDien();
        TD.addTu("phone", "dien thoai", "noun", "thiet bị cam tay");
        TD.addTu("Laptop", "may tinh xach tay", "noun", "thiet bi xach tay");
        TD.addTu("Car", "xe", "noun", "phuong tien di chuyen"); 
        
        String search = "car";
        System.out.println("Tra tu: " + search);
        TD.traTu(search);
    }

}
